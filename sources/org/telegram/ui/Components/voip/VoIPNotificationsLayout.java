package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.VoIPFragment;

public final class VoIPNotificationsLayout extends LinearLayout {
    public final VoIPBackgroundProvider backgroundProvider;
    public boolean lockAnimation;
    public Runnable onViewsUpdated;
    public final TextPaint textPaint;
    public final TransitionSet transitionSet;
    public final ArrayList viewToAdd;
    public final ArrayList viewToRemove;
    public final HashMap viewsByTag;
    public boolean wasChanged;

    public final class NotificationView extends FrameLayout {
        public final VoIPBackgroundProvider backgroundProvider;
        public final RectF bgRect;
        public final ImageView iconView;
        public boolean ignoreShader;
        public String tag;
        public final TextView textView;

        public NotificationView(Context context, VoIPBackgroundProvider voIPBackgroundProvider, int i) {
            super(context);
            this.bgRect = new RectF();
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.backgroundProvider = voIPBackgroundProvider;
            voIPBackgroundProvider.views.add(this);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, i == 0 ? 14.0f : 36.0f, 2.0f, 14.0f, 2.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            RectF rectF = this.bgRect;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float x = ((View) getParent()).getX() + getX();
            float y = ((View) getParent()).getY() + getY();
            VoIPBackgroundProvider voIPBackgroundProvider = this.backgroundProvider;
            voIPBackgroundProvider.setDarkTranslation(x, y);
            boolean z = this.ignoreShader;
            Paint darkPaint = voIPBackgroundProvider.darkPaint;
            int alpha = (z ? darkPaint : voIPBackgroundProvider.getDarkPaint()).getAlpha();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
            (this.ignoreShader ? darkPaint : voIPBackgroundProvider.getDarkPaint()).setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.ignoreShader ? darkPaint : voIPBackgroundProvider.getDarkPaint());
            if (!this.ignoreShader) {
                darkPaint = voIPBackgroundProvider.getDarkPaint();
            }
            darkPaint.setAlpha(alpha);
            if (voIPBackgroundProvider.isReveal) {
                int alpha2 = ((Paint) voIPBackgroundProvider.revealDarkShaderTools.app).getAlpha();
                ((Paint) voIPBackgroundProvider.revealDarkShaderTools.app).setAlpha(255);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), (Paint) voIPBackgroundProvider.revealDarkShaderTools.app);
                ((Paint) voIPBackgroundProvider.revealDarkShaderTools.app).setAlpha(alpha2);
            }
            canvas.restore();
            super.dispatchDraw(canvas);
        }
    }

    public VoIPNotificationsLayout(Activity activity, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(activity);
        this.viewsByTag = new HashMap();
        this.viewToAdd = new ArrayList();
        this.viewToRemove = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        setOrientation(1);
        this.backgroundProvider = voIPBackgroundProvider;
        TransitionSet transitionSet = new TransitionSet();
        this.transitionSet = transitionSet;
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new VoIPFragment.AnonymousClass23(5).setDuration(200L));
        transitionSet.setOrdering(0);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
    }

    public final void addNotification(int i, String str, String str2) {
        HashMap map = this.viewsByTag;
        if (map.get(str2) != null) {
            return;
        }
        NotificationView notificationView = new NotificationView(getContext(), this.backgroundProvider, i);
        notificationView.tag = str2;
        int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(120.0f);
        TextView textView = notificationView.textView;
        StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(str, textView.getPaint(), iDp, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, iDp, 10, true);
        if (staticLayoutCreateStaticLayout != null) {
            iDp = 0;
            for (int i2 = 0; i2 < staticLayoutCreateStaticLayout.getLineCount(); i2++) {
                iDp = (int) Math.max(iDp, Math.ceil(staticLayoutCreateStaticLayout.getLineWidth(i2)));
            }
        }
        textView.setMaxWidth(iDp);
        textView.setText(str);
        notificationView.iconView.setImageResource(i);
        map.put(str2, notificationView);
        if (this.lockAnimation) {
            this.viewToAdd.add(notificationView);
        } else {
            this.wasChanged = true;
            addView(notificationView, LayoutHelper.createLinear(-2, -2, 1, 4, 0, 0, 4));
        }
    }

    public int getChildsHight() {
        int childCount = getChildCount();
        return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(childCount, 32.0f, childCount > 0 ? AndroidUtilities.dp(16.0f) : 0);
    }

    public final void removeNotification(String str) {
        NotificationView notificationView = (NotificationView) this.viewsByTag.remove(str);
        this.backgroundProvider.views.remove(notificationView);
        if (notificationView != null) {
            if (!this.lockAnimation) {
                this.wasChanged = true;
                removeView(notificationView);
            } else {
                if (this.viewToAdd.remove(notificationView)) {
                    return;
                }
                this.viewToRemove.add(notificationView);
            }
        }
    }

    public void setOnViewsUpdated(Runnable runnable) {
        this.onViewsUpdated = runnable;
    }
}

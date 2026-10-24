package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qk0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Paint f29939a;
    public final RectF f29940b;
    public final float f29941c;
    public final u9 d;
    public final ImageView e;
    public final TextView f29942f;
    public final View h;
    public float f29943n;
    public final Drawable f29944r;
    public int f29945s;
    public ah.i1 v;

    public qk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29939a = new Paint(1);
        new Path();
        this.f29940b = new RectF();
        this.f29941c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f29944r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        u9 u9Var = new u9(context);
        this.d = u9Var;
        addView(u9Var, w7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29942f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21369n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f29943n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f29945s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f29942f.setText(formatShortNumber);
        ah.i1 d = ah.i1.d(reactionCount.reaction);
        this.v = d;
        String str = d.f784f;
        ImageView imageView = this.e;
        u9 u9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f784f)) {
                    u9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21126a7, 1.0f), tL_availableReaction);
                    u9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        u9Var.setAnimatedEmojiDrawable(new p5(0, i10, this.v.f785g));
        u9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ej));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f29940b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f29941c;
        canvas.drawRoundRect(rectF, f7, f7, this.f29939a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f29943n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ah.i1 i1Var = this.v;
        if (i1Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f29945s, i1Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f29945s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f29945s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f29942f.setText(formatShortNumber);
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f29943n = f7;
        int i10 = org.telegram.ui.ActionBar.k6.Cj;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.k6.Fj;
        int f10 = i0.a.f(f7, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ej, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f29939a.setColor(i0.a.f(f7, o10, x02));
        this.f29942f.setTextColor(f10);
        this.f29944r.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        float f11 = this.f29941c;
        View view = this.h;
        if (i12 == 0) {
            int i13 = (int) f11;
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 76);
            org.telegram.ui.ActionBar.r6.S(view, org.telegram.ui.ActionBar.k6.j0(i13, i13, i13, i13, 0, o11, o11), null, org.telegram.ui.ActionBar.r6.h(i11, 76), null);
        } else if (f7 == 0.0f) {
            int i14 = (int) f11;
            int o12 = i0.a.o(x02, 76);
            org.telegram.ui.ActionBar.r6.S(view, org.telegram.ui.ActionBar.k6.j0(i14, i14, i14, i14, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i10, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.f29939a;
        if (paint != null && (textView = this.f29942f) != null && (drawable = this.f29944r) != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false);
                int o10 = i0.a.o(x02, 16);
                int f7 = i0.a.f(this.f29943n, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ej, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Fj, false));
                paint.setColor(i0.a.f(this.f29943n, o10, x02));
                if (textView.getCurrentTextColor() != f7) {
                    textView.setTextColor(f7);
                    drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

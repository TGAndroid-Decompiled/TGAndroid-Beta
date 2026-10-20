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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ok0 extends FrameLayout {
    public final Paint f29055a;
    public final RectF f29056b;
    public final float f29057c;
    public final w9 d;
    public final ImageView e;
    public final TextView f29058f;
    public final View h;
    public float f29059n;
    public final Drawable f29060r;
    public int f29061s;
    public ah.i1 v;

    public ok0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29055a = new Paint(1);
        new Path();
        this.f29056b = new RectF();
        this.f29057c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f29060r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        addView(w9Var, w7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29058f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21175n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f29059n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f29061s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f29058f.setText(formatShortNumber);
        ah.i1 d = ah.i1.d(reactionCount.reaction);
        this.v = d;
        String str = d.f783f;
        ImageView imageView = this.e;
        w9 w9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f783f)) {
                    w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20932a7, 1.0f), tL_availableReaction);
                    w9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        w9Var.setAnimatedEmojiDrawable(new r5(0, i10, this.v.f784g));
        w9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f29056b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f29057c;
        canvas.drawRoundRect(rectF, f7, f7, this.f29055a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f29059n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ah.i1 i1Var = this.v;
        if (i1Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f29061s, i1Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f29061s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f29061s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f29058f.setText(formatShortNumber);
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f29059n = f7;
        int i10 = org.telegram.ui.ActionBar.h6.Cj;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.h6.Fj;
        int f10 = i0.a.f(f7, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ej, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f29055a.setColor(i0.a.f(f7, o10, x02));
        this.f29058f.setTextColor(f10);
        this.f29060r.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        float f11 = this.f29057c;
        View view = this.h;
        if (i12 == 0) {
            int i13 = (int) f11;
            int o11 = i0.a.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.j0(i13, i13, i13, i13, 0, o11, o11));
        } else if (f7 == 0.0f) {
            int i14 = (int) f11;
            int o12 = i0.a.o(x02, 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.j0(i14, i14, i14, i14, 0, o12, o12));
        }
        invalidate();
    }
}

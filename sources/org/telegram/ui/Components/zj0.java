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
public final class zj0 extends FrameLayout {
    public final Paint f31394a;
    public final RectF f31395b;
    public final float f31396c;
    public final p9 d;
    public final ImageView e;
    public final TextView f31397f;
    public final View h;
    public float f31398n;
    public final Drawable f31399r;
    public int f31400s;
    public mg.q0 v;

    public zj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f31394a = new Paint(1);
        new Path();
        this.f31395b = new RectF();
        this.f31396c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, k7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f31399r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, k7.b6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        addView(p9Var, k7.b6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31397f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20062n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, k7.b6.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f31398n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f31400s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f31397f.setText(formatShortNumber);
        mg.q0 d = mg.q0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f14095f;
        ImageView imageView = this.e;
        p9 p9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f14095f)) {
                    p9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f19827a7, 1.0f), tL_availableReaction);
                    p9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        p9Var.setAnimatedEmojiDrawable(new l5(0, i10, this.v.f14096g));
        p9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f31395b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f31396c;
        canvas.drawRoundRect(rectF, f10, f10, this.f31394a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f31398n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        mg.q0 q0Var = this.v;
        if (q0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f31400s, q0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f31400s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f31400s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f31397f.setText(formatShortNumber);
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f31398n = f10;
        int i10 = org.telegram.ui.ActionBar.j6.Cj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.j6.Fj;
        int d = i0.a.d(f10, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ej, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f31394a.setColor(i0.a.d(f10, k10, w02));
        this.f31397f.setTextColor(d);
        this.f31399r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f11 = this.f31396c;
        View view = this.h;
        if (f10 == 1.0f) {
            int i12 = (int) f11;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.j6.i0(i12, i12, i12, i12, 0, k11, k11));
        } else if (f10 == 0.0f) {
            int i13 = (int) f11;
            int k12 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.j6.i0(i13, i13, i13, i13, 0, k12, k12));
        }
        invalidate();
    }
}

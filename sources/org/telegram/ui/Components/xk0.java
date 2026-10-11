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
public final class xk0 extends FrameLayout {
    public final Paint f32940a;
    public final RectF f32941b;
    public final float f32942c;
    public final y9 d;
    public final ImageView f32943e;
    public final TextView f32944f;
    public final View h;
    public float f32945n;
    public final Drawable f32946r;
    public int f32947s;
    public zg.n0 v;

    public xk0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f32940a = new Paint(1);
        new Path();
        this.f32941b = new RectF();
        this.f32942c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.x5.d(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f32943e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f32946r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        addView(y9Var, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f32944f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20973n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f32945n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f32947s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f32944f.setText(formatShortNumber);
        zg.n0 d = zg.n0.d(reactionCount.reaction);
        this.v = d;
        String str = d.f54704f;
        ImageView imageView = this.f32943e;
        y9 y9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f54704f)) {
                    y9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20730a7, 1.0f), tL_availableReaction);
                    y9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        y9Var.setAnimatedEmojiDrawable(new s5(0, i10, this.v.f54705g));
        y9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f32941b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f32942c;
        canvas.drawRoundRect(rectF, f7, f7, this.f32940a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f32945n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        zg.n0 n0Var = this.v;
        if (n0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f32947s, n0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f32947s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f32947s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f32944f.setText(formatShortNumber);
        this.f32943e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f32945n = f7;
        int i10 = org.telegram.ui.ActionBar.h6.Cj;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.h6.Fj;
        int d = i0.a.d(f7, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ej, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f32940a.setColor(i0.a.d(f7, k10, x02));
        this.f32944f.setTextColor(d);
        this.f32946r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        float f10 = this.f32942c;
        View view = this.h;
        if (i12 == 0) {
            int i13 = (int) f10;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.j0(i13, i13, i13, i13, 0, k11, k11));
        } else if (f7 == 0.0f) {
            int i14 = (int) f10;
            int k12 = i0.a.k(x02, 76);
            view.setBackground(org.telegram.ui.ActionBar.h6.j0(i14, i14, i14, i14, 0, k12, k12));
        }
        invalidate();
    }
}

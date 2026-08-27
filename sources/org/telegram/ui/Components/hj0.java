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

public final class hj0 extends FrameLayout {

    public final Paint f29041a;

    public final RectF f29042b;

    public final float f29043c;
    public final n9 d;

    public final ImageView f29044e;

    public final TextView f29045f;
    public final View h;

    public float f29046n;

    public final Drawable f29047r;

    public int f29048s;
    public ig.q0 v;

    public hj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29041a = new Paint(1);
        new Path();
        this.f29042b = new RectF();
        this.f29043c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, h7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f29044e = imageView;
        Drawable drawableMutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f29047r = drawableMutate;
        imageView.setImageDrawable(drawableMutate);
        addView(imageView, h7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        n9 n9Var = new n9(context);
        this.d = n9Var;
        addView(n9Var, h7.z5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29045f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23236n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, h7.z5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f29046n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f29048s = i11;
        this.f29045f.setText(LocaleController.formatShortNumber(i11, null));
        ig.q0 q0VarD = ig.q0.d(reactionCount.reaction);
        this.v = q0VarD;
        String str = q0VarD.f11412f;
        ImageView imageView = this.f29044e;
        n9 n9Var = this.d;
        if (str == null) {
            n9Var.setAnimatedEmojiDrawable(new k5(0, i10, this.v.f11413g));
            n9Var.setVisibility(0);
            imageView.setVisibility(8);
            return;
        }
        for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
            if (tL_availableReaction.reaction.equals(this.v.f11412f)) {
                n9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f), tL_availableReaction);
                n9Var.setVisibility(0);
                imageView.setVisibility(8);
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f29042b;
        rectF.set(0.0f, 0.0f, width, height);
        float f10 = this.f29043c;
        canvas.drawRoundRect(rectF, f10, f10, this.f29041a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f29046n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ig.q0 q0Var = this.v;
        if (q0Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f29048s, q0Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f29048s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f29048s = i10;
        this.f29045f.setText(LocaleController.formatShortNumber(i10, null));
        this.f29044e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f29046n = f10;
        int i10 = org.telegram.ui.ActionBar.g6.Cj;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.g6.Fj;
        int iD = i0.b.d(f10, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ej, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f29041a.setColor(i0.b.d(f10, iK, iW0));
        this.f29045f.setTextColor(iD);
        this.f29047r.setColorFilter(new PorterDuffColorFilter(iD, PorterDuff.Mode.MULTIPLY));
        float f11 = this.f29043c;
        View view = this.h;
        if (f10 == 1.0f) {
            int i12 = (int) f11;
            int iK2 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.g6.i0(i12, i12, i12, i12, 0, iK2, iK2));
        } else if (f10 == 0.0f) {
            int i13 = (int) f11;
            int iK3 = i0.b.k(iW0, 76);
            view.setBackground(org.telegram.ui.ActionBar.g6.i0(i13, i13, i13, i13, 0, iK3, iK3));
        }
        invalidate();
    }
}

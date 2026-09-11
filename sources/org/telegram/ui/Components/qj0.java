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
public final class qj0 extends FrameLayout {
    public final Paint f29743a;
    public final RectF f29744b;
    public final float f29745c;
    public final x9 d;
    public final ImageView f29746e;
    public final TextView f29747f;
    public final View h;
    public float f29748n;
    public final Drawable f29749r;
    public int f29750s;
    public ah.j1 v;

    public qj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29743a = new Paint(1);
        new Path();
        this.f29744b = new RectF();
        this.f29745c = AndroidUtilities.dp(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f29746e = imageView;
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions_filled).mutate();
        this.f29749r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        x9 x9Var = new x9(context);
        this.d = x9Var;
        addView(x9Var, w7.x5.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29747f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20848n8, false));
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.x5.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f29748n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f29750s = i11;
        String formatShortNumber = LocaleController.formatShortNumber(i11, null);
        this.f29747f.setText(formatShortNumber);
        ah.j1 d = ah.j1.d(reactionCount.reaction);
        this.v = d;
        String str = d.f597f;
        ImageView imageView = this.f29746e;
        x9 x9Var = this.d;
        if (str != null) {
            for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i10).getReactionsList()) {
                if (tL_availableReaction.reaction.equals(this.v.f597f)) {
                    x9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f20607a7, 1.0f), tL_availableReaction);
                    x9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        x9Var.setAnimatedEmojiDrawable(new q5(0, i10, this.v.f598g));
        x9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f29744b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f29745c;
        canvas.drawRoundRect(rectF, f7, f7, this.f29743a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f29748n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ah.j1 j1Var = this.v;
        if (j1Var != null) {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrNumberOfPeopleReactions", this.f29750s, j1Var));
        } else {
            accessibilityNodeInfo.setText(LocaleController.formatPluralString("ReactionsCount", this.f29750s, new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f29750s = i10;
        String formatShortNumber = LocaleController.formatShortNumber(i10, null);
        this.f29747f.setText(formatShortNumber);
        this.f29746e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f29748n = f7;
        int i10 = org.telegram.ui.ActionBar.j6.Cj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.j6.Fj;
        int d = i0.a.d(f7, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ej, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f29743a.setColor(i0.a.d(f7, k10, w02));
        this.f29747f.setTextColor(d);
        this.f29749r.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
        float f10 = this.f29745c;
        View view = this.h;
        if (f7 == 1.0f) {
            int i12 = (int) f10;
            int k11 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i11, false), 76);
            view.setBackground(org.telegram.ui.ActionBar.j6.i0(i12, i12, i12, i12, 0, k11, k11));
        } else if (f7 == 0.0f) {
            int i13 = (int) f10;
            int k12 = i0.a.k(w02, 76);
            view.setBackground(org.telegram.ui.ActionBar.j6.i0(i13, i13, i13, i13, 0, k12, k12));
        }
        invalidate();
    }
}

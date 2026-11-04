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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vh0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Paint f39116a;
    public final RectF f39117b;
    public final float f39118c;
    public final k9 d;
    public final ImageView f39119e;
    public final TextView f39120f;
    public final View h;
    public float f39121n;
    public final Drawable f39122r;
    public int f39123s;
    public dh.n0 f39124w;

    public vh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f39116a = new Paint(1);
        new Path();
        this.f39117b = new RectF();
        this.f39118c = org.telegram.messenger.g0.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f39119e = imageView;
        Drawable mutate = context.getDrawable(2131232326).mutate();
        this.f39122r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, b8.mf.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.d = k9Var;
        addView(k9Var, b8.mf.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39120f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28064n8, false));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, b8.mf.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f39121n);
    }

    public final void a(int i3, TLRPC.ReactionCount reactionCount) {
        int i10 = reactionCount.count;
        this.f39123s = i10;
        this.f39120f.setText(org.telegram.messenger.bd.S(null, i10));
        dh.n0 d = dh.n0.d(reactionCount.reaction);
        this.f39124w = d;
        String str = d.f9097f;
        ImageView imageView = this.f39119e;
        k9 k9Var = this.d;
        if (str != null) {
            ArrayList arrayList = org.telegram.messenger.li.b0(i3).h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.f39124w.f9097f)) {
                    k9Var.k(org.telegram.messenger.ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, null), tL_availableReaction);
                    k9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        k9Var.setAnimatedEmojiDrawable(new g5(0, i3, this.f39124w.f9098g));
        k9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f39117b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f39118c;
        canvas.drawRoundRect(rectF, f10, f10, this.f39116a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f39121n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        dh.n0 n0Var = this.f39124w;
        if (n0Var != null) {
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(this.f39123s, "AccDescrNumberOfPeopleReactions", n0Var));
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(this.f39123s, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i3) {
        this.f39123s = i3;
        this.f39120f.setText(org.telegram.messenger.bd.S(null, i3));
        this.f39119e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f39121n = f10;
        int i3 = org.telegram.ui.ActionBar.k6.qk;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, false), 16);
        int i10 = org.telegram.ui.ActionBar.k6.tk;
        int f11 = i0.a.f(f10, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.sk, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f39116a.setColor(i0.a.f(f10, o10, x02));
        this.f39120f.setTextColor(f11);
        this.f39122r.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.MULTIPLY));
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        float f12 = this.f39118c;
        View view = this.h;
        if (i11 == 0) {
            int i12 = (int) f12;
            int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 76);
            org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.k0(i12, i12, i12, i12, 0, o11, o11), null, org.telegram.ui.ActionBar.r6.h(i10, 76), null);
        } else if (f10 == 0.0f) {
            int i13 = (int) f12;
            int o12 = i0.a.o(x02, 76);
            org.telegram.ui.ActionBar.r6.R(view, org.telegram.ui.ActionBar.k6.k0(i13, i13, i13, i13, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i3, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.f39116a;
        if (paint != null && (textView = this.f39120f) != null && (drawable = this.f39122r) != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.qk, false);
                int o10 = i0.a.o(x02, 16);
                int f10 = i0.a.f(this.f39121n, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.sk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.tk, false));
                paint.setColor(i0.a.f(this.f39121n, o10, x02));
                if (textView.getCurrentTextColor() != f10) {
                    textView.setTextColor(f10);
                    drawable.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

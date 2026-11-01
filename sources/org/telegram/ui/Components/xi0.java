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
public final class xi0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Paint f32571a;
    public final RectF f32572b;
    public final float f32573c;
    public final g9 d;
    public final ImageView e;
    public final TextView f32574f;
    public final View h;
    public float f32575n;
    public final Drawable f32576r;
    public int f32577s;
    public sg.o0 f32578w;

    public xi0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f32571a = new Paint(1);
        new Path();
        this.f32572b = new RectF();
        this.f32573c = org.telegram.messenger.i0.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        Drawable mutate = context.getDrawable(2131232325).mutate();
        this.f32576r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.b6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        addView(g9Var, w7.b6.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f32574f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21118n8, false));
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, w7.b6.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f32575n);
    }

    public final void a(int i10, TLRPC.ReactionCount reactionCount) {
        int i11 = reactionCount.count;
        this.f32577s = i11;
        this.f32574f.setText(org.telegram.messenger.dd.S(null, i11));
        sg.o0 d = sg.o0.d(reactionCount.reaction);
        this.f32578w = d;
        String str = d.f48445f;
        ImageView imageView = this.e;
        g9 g9Var = this.d;
        if (str != null) {
            ArrayList arrayList = org.telegram.messenger.vi.b0(i10).h;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.f32578w.f48445f)) {
                    g9Var.k(org.telegram.messenger.jc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.v5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.t6.f20873a7, 1.0f, null), tL_availableReaction);
                    g9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        g9Var.setAnimatedEmojiDrawable(new f5(0, i10, this.f32578w.f48446g));
        g9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f32572b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f7 = this.f32573c;
        canvas.drawRoundRect(rectF, f7, f7, this.f32571a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f32575n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        sg.o0 o0Var = this.f32578w;
        if (o0Var != null) {
            accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(this.f32577s, "AccDescrNumberOfPeopleReactions", o0Var));
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(this.f32577s, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i10) {
        this.f32577s = i10;
        this.f32574f.setText(org.telegram.messenger.dd.S(null, i10));
        this.e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f7) {
        this.f32575n = f7;
        int i10 = org.telegram.ui.ActionBar.t6.qk;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 16);
        int i11 = org.telegram.ui.ActionBar.t6.tk;
        int f10 = i0.b.f(f7, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.sk, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f32571a.setColor(i0.b.f(f7, o10, x02));
        this.f32574f.setTextColor(f10);
        this.f32576r.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        float f11 = this.f32573c;
        View view = this.h;
        if (i12 == 0) {
            int i13 = (int) f11;
            int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 76);
            org.telegram.ui.ActionBar.a7.R(view, org.telegram.ui.ActionBar.t6.k0(i13, i13, i13, i13, 0, o11, o11), null, org.telegram.ui.ActionBar.a7.h(i11, 76), null);
        } else if (f7 == 0.0f) {
            int i14 = (int) f11;
            int o12 = i0.b.o(x02, 76);
            org.telegram.ui.ActionBar.a7.R(view, org.telegram.ui.ActionBar.t6.k0(i14, i14, i14, i14, 0, o12, o12), null, org.telegram.ui.ActionBar.a7.h(i10, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.f32571a;
        if (paint != null && (textView = this.f32574f) != null && (drawable = this.f32576r) != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.qk, false);
                int o10 = i0.b.o(x02, 16);
                int f7 = i0.b.f(this.f32575n, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.sk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.tk, false));
                paint.setColor(i0.b.f(this.f32575n, o10, x02));
                if (textView.getCurrentTextColor() != f7) {
                    textView.setTextColor(f7);
                    drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}

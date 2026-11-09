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
public final class th0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Paint f38420a;
    public final RectF f38421b;
    public final float f38422c;
    public final l9 d;
    public final ImageView f38423e;
    public final TextView f38424f;
    public final View h;
    public float f38425n;
    public final Drawable f38426r;
    public int f38427s;
    public ch.o0 f38428w;

    public th0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f38420a = new Paint(1);
        new Path();
        this.f38421b = new RectF();
        this.f38422c = org.telegram.messenger.g0.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f38423e = imageView;
        Drawable mutate = context.getDrawable(2131232326).mutate();
        this.f38426r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.d = l9Var;
        addView(l9Var, c8.ha.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f38424f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28049n8, false));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f38425n);
    }

    public final void a(int i7, TLRPC.ReactionCount reactionCount) {
        int i10 = reactionCount.count;
        this.f38427s = i10;
        this.f38424f.setText(org.telegram.messenger.id.S(null, i10));
        ch.o0 d = ch.o0.d(reactionCount.reaction);
        this.f38428w = d;
        String str = d.f6354f;
        ImageView imageView = this.f38423e;
        l9 l9Var = this.d;
        if (str != null) {
            ArrayList arrayList = org.telegram.messenger.ui.b0(i7).h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.f38428w.f6354f)) {
                    l9Var.k(org.telegram.messenger.hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, null), tL_availableReaction);
                    l9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        l9Var.setAnimatedEmojiDrawable(new i5(0, i7, this.f38428w.f6355g));
        l9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.sk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f38421b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f38422c;
        canvas.drawRoundRect(rectF, f10, f10, this.f38420a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f38425n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ch.o0 o0Var = this.f38428w;
        if (o0Var != null) {
            accessibilityNodeInfo.setText(org.telegram.messenger.id.G(this.f38427s, "AccDescrNumberOfPeopleReactions", o0Var));
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.id.G(this.f38427s, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i7) {
        this.f38427s = i7;
        this.f38424f.setText(org.telegram.messenger.id.S(null, i7));
        this.f38423e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f38425n = f10;
        int i7 = org.telegram.ui.ActionBar.l6.qk;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i7, false), 16);
        int i10 = org.telegram.ui.ActionBar.l6.tk;
        int f11 = i0.a.f(f10, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.sk, false), org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        this.f38420a.setColor(i0.a.f(f10, o4, x02));
        this.f38424f.setTextColor(f11);
        this.f38426r.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.MULTIPLY));
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        float f12 = this.f38422c;
        View view = this.h;
        if (i11 == 0) {
            int i12 = (int) f12;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, i10, false), 76);
            org.telegram.ui.ActionBar.s6.Q(view, org.telegram.ui.ActionBar.l6.k0(i12, i12, i12, i12, 0, o10, o10), null, org.telegram.ui.ActionBar.s6.g(i10, 76), null);
        } else if (f10 == 0.0f) {
            int i13 = (int) f12;
            int o11 = i0.a.o(x02, 76);
            org.telegram.ui.ActionBar.s6.Q(view, org.telegram.ui.ActionBar.l6.k0(i13, i13, i13, i13, 0, o11, o11), null, org.telegram.ui.ActionBar.s6.g(i7, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.f38420a;
        if (paint != null && (textView = this.f38424f) != null && (drawable = this.f38426r) != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.qk, false);
                int o4 = i0.a.o(x02, 16);
                int f10 = i0.a.f(this.f38425n, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.sk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.tk, false));
                paint.setColor(i0.a.f(this.f38425n, o4, x02));
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

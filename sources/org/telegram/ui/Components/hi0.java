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
public final class hi0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Paint f35743a;
    public final RectF f35744b;
    public final float f35745c;
    public final p9 d;
    public final ImageView f35746e;
    public final TextView f35747f;
    public final View h;
    public float f35748n;
    public final Drawable f35749r;
    public int f35750s;
    public ch.p0 f35751w;

    public hi0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f35743a = new Paint(1);
        new Path();
        this.f35744b = new RectF();
        this.f35745c = org.telegram.messenger.g0.L(32.0f);
        View view = new View(context);
        this.h = view;
        addView(view, c8.na.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f35746e = imageView;
        Drawable mutate = context.getDrawable(2131232331).mutate();
        this.f35749r = mutate;
        imageView.setImageDrawable(mutate);
        addView(imageView, c8.na.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        addView(p9Var, c8.na.i(24.0f, 24.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f35747f = textView;
        textView.setImportantForAccessibility(2);
        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29635n8, false));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.na.i(-1.0f, -2.0f, 8388627, 40.0f, 0.0f, 8.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        setWillNotDraw(false);
        setOutlineProgress(this.f35748n);
    }

    public final void a(int i7, TLRPC.ReactionCount reactionCount) {
        int i10 = reactionCount.count;
        this.f35750s = i10;
        this.f35747f.setText(org.telegram.messenger.gd.S(null, i10));
        ch.p0 d = ch.p0.d(reactionCount.reaction);
        this.f35751w = d;
        String str = d.f5470f;
        ImageView imageView = this.f35746e;
        p9 p9Var = this.d;
        if (str != null) {
            ArrayList arrayList = org.telegram.messenger.ri.d0(i7).h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                if (tL_availableReaction.reaction.equals(this.f35751w.f5470f)) {
                    p9Var.k(org.telegram.messenger.fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.f29394a7, 1.0f, null), tL_availableReaction);
                    p9Var.setVisibility(0);
                    imageView.setVisibility(8);
                    return;
                }
            }
            return;
        }
        p9Var.setAnimatedEmojiDrawable(new o5(0, i7, this.f35751w.f5471g));
        p9Var.setVisibility(0);
        imageView.setVisibility(8);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.vk));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f35744b;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f35745c;
        canvas.drawRoundRect(rectF, f10, f10, this.f35743a);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        if (this.f35748n > 0.5d) {
            accessibilityNodeInfo.setSelected(true);
        }
        ch.p0 p0Var = this.f35751w;
        if (p0Var != null) {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(this.f35750s, "AccDescrNumberOfPeopleReactions", p0Var));
        } else {
            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(this.f35750s, "ReactionsCount", new Object[0]));
        }
    }

    public void setCounter(int i7) {
        this.f35750s = i7;
        this.f35747f.setText(org.telegram.messenger.gd.S(null, i7));
        this.f35746e.setVisibility(0);
        this.d.setVisibility(8);
    }

    public void setOutlineProgress(float f10) {
        this.f35748n = f10;
        int i7 = org.telegram.ui.ActionBar.n6.tk;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 16);
        int i10 = org.telegram.ui.ActionBar.n6.wk;
        int f11 = i0.a.f(f10, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.vk, false), org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        this.f35743a.setColor(i0.a.f(f10, o4, x02));
        this.f35747f.setTextColor(f11);
        this.f35749r.setColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.MULTIPLY));
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        float f12 = this.f35745c;
        View view = this.h;
        if (i11 == 0) {
            int i12 = (int) f12;
            int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 76);
            org.telegram.ui.ActionBar.u6.Q(view, org.telegram.ui.ActionBar.n6.k0(i12, i12, i12, i12, 0, o10, o10), null, org.telegram.ui.ActionBar.u6.g(i10, 76), null);
        } else if (f10 == 0.0f) {
            int i13 = (int) f12;
            int o11 = i0.a.o(x02, 76);
            org.telegram.ui.ActionBar.u6.Q(view, org.telegram.ui.ActionBar.n6.k0(i13, i13, i13, i13, 0, o11, o11), null, org.telegram.ui.ActionBar.u6.g(i7, 76), null);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        Drawable drawable;
        Paint paint = this.f35743a;
        if (paint != null && (textView = this.f35747f) != null && (drawable = this.f35749r) != null) {
            try {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.tk, false);
                int o4 = i0.a.o(x02, 16);
                int f10 = i0.a.f(this.f35748n, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.vk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.wk, false));
                paint.setColor(i0.a.f(this.f35748n, o4, x02));
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

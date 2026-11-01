package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class cw0 extends uk0 implements org.telegram.ui.ActionBar.k6 {
    public static final aw0 E3 = new org.telegram.messenger.b3();
    public static final bw0 F3 = new org.telegram.messenger.b3();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f25263e3;
    public yv0[] f25264f3;
    public final tv0 f25265g3;
    public final t5 f25266h3;
    public Drawable f25267i3;
    public Drawable f25268j3;
    public Paint f25269k3;
    public final Paint f25270l3;
    public int f25271m3;
    public int f25272n3;
    public org.telegram.messenger.r20 f25273o3;
    public org.telegram.messenger.r20 f25274p3;
    public boolean f25275q3;
    public boolean f25276r3;
    public bi.t0 f25277s3;
    public int f25278t3;
    public org.telegram.messenger.r20 f25279u3;
    public float f25280v3;
    public ValueAnimator f25281w3;
    public boolean f25282x3;
    public final t5 y3;
    public final t5 f25283z3;

    static {
        new HashSet();
    }

    public cw0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f25263e3 = 6.5f;
        this.f25264f3 = null;
        gr grVar = gr.h;
        this.f25266h3 = new t5(this, 360L, grVar);
        Paint paint = new Paint(1);
        this.f25270l3 = paint;
        this.f25278t3 = -1;
        this.f25280v3 = 0.0f;
        this.f25282x3 = true;
        this.y3 = new t5(this, 350L, grVar);
        this.f25283z3 = new t5(this, 350L, grVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.i0.L(2.0f), 0);
        tv0 tv0Var = new tv0(this);
        this.f25265g3 = tv0Var;
        setAdapter(tv0Var);
        s4.a0 a0Var = new s4.a0();
        setLayoutManager(a0Var);
        a0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.i0.L(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.m(this, 20, i11, p6Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.f31008n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.e20.f15506s0, Integer.valueOf(i10), new org.telegram.ui.ActionBar.u3(this, currentTimeMillis, 1));
    }

    public static void A1(cw0 cw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        cw0Var.f25264f3 = new yv0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            yv0[] yv0VarArr = cw0Var.f25264f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f32918c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f32916a = "premium";
            } else {
                obj.f32916a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f32917b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            yv0VarArr[i10] = obj;
        }
        cw0Var.f25264f3 = cw0Var.E1(cw0Var.f25264f3);
        cw0Var.f25265g3.f();
        cw0Var.setCategoriesShownT(0.0f);
        boolean z11 = cw0Var.f25282x3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        cw0Var.J1(z11, z10);
    }

    public static void B1(cw0 cw0Var, float f7) {
        cw0Var.setCategoriesShownT(f7);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.i0.L(1.0f);
        if (view instanceof xv0) {
            xv0 xv0Var = (xv0) view;
            f7 = c3.i0.z(1.0f, xv0Var.E, 0.15f, 0.85f) * xv0Var.D;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof xv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f25271m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f25280v3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof xv0) {
                float s10 = org.telegram.messenger.i0.s(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s10 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((xv0) childAt).j();
                }
                childAt.setAlpha(s10);
                childAt.setScaleX(s10);
                childAt.setScaleY(s10);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.i0.L(34.0f) * this.f25278t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f25272n3));
        scrollBy(L, 0);
        post(new vo0((vh.o1) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, gr.h);
    }

    public void H1(int i10) {
        boolean z10;
        if (this.f25278t3 < 0 && i10 >= 0) {
            this.f25283z3.e(true, i10);
        }
        this.f25278t3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof xv0) {
                int R = RecyclerView.R(childAt);
                xv0 xv0Var = (xv0) childAt;
                if (this.f25278t3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(yv0 yv0Var) {
        int i10;
        if (this.f25264f3 != null) {
            i10 = 0;
            while (true) {
                yv0[] yv0VarArr = this.f25264f3;
                if (i10 >= yv0VarArr.length) {
                    break;
                } else if (yv0VarArr[i10] == yv0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            H1(i10);
        }
        i10 = -1;
        H1(i10);
    }

    public final void J1(boolean z10, boolean z11) {
        int length;
        this.f25282x3 = z10;
        ?? r52 = z10;
        if (this.f25264f3 == null) {
            r52 = 0;
        }
        if (this.f25280v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f25281w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25281w3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f25280v3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25281w3 = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 22));
            this.f25281w3.addListener(new t60(this, 23));
            this.f25281w3.setInterpolator(gr.h);
            ValueAnimator valueAnimator2 = this.f25281w3;
            yv0[] yv0VarArr = this.f25264f3;
            if (yv0VarArr == null) {
                length = 5;
            } else {
                length = yv0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f25281w3.start();
            return;
        }
        if (r52 != 0) {
            f7 = 1.0f;
        }
        setCategoriesShownT(f7);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof xv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cw0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f25278t3;
    }

    public yv0 getSelectedCategory() {
        int i10;
        yv0[] yv0VarArr = this.f25264f3;
        if (yv0VarArr != null && (i10 = this.f25278t3) >= 0 && i10 < yv0VarArr.length) {
            return yv0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.r20 r20Var;
        int i11 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof xv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f25272n3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f25275q3;
        if (z12 != z11) {
            this.f25275q3 = z11;
            org.telegram.messenger.r20 r20Var2 = this.f25273o3;
            if (r20Var2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f25271m3 - this.f25272n3));
                }
                r20Var2.a(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (r20Var = this.f25273o3) != null) {
            r20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f25271m3 - this.f25272n3))));
        }
        if (this.f25276r3 != z10) {
            this.f25276r3 = z10;
            org.telegram.messenger.r20 r20Var3 = this.f25274p3;
            if (r20Var3 != null) {
                r20Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f25282x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.t0 t0Var = this.f25277s3;
        if (t0Var != null) {
            t0Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f25269k3 == null) {
            this.f25269k3 = new Paint(1);
        }
        this.f25269k3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(2131231228).mutate();
        this.f25267i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231227).mutate();
        this.f25268j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f25272n3 = i10;
    }

    public void setOnCategoryClick(org.telegram.messenger.r20 r20Var) {
        this.f25279u3 = r20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.r20 r20Var) {
        this.f25274p3 = r20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.r20 r20Var) {
        this.f25273o3 = r20Var;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f25263e3 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f25270l3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21021i6, this.f31008n2));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public yv0[] E1(yv0[] yv0VarArr) {
        return yv0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public abstract class bw0 extends tk0 implements org.telegram.ui.ActionBar.k6 {
    public static final zv0 E3 = new org.telegram.messenger.b3();
    public static final aw0 F3 = new org.telegram.messenger.b3();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f24888e3;
    public xv0[] f24889f3;
    public final sv0 f24890g3;
    public final t5 f24891h3;
    public Drawable f24892i3;
    public Drawable f24893j3;
    public Paint f24894k3;
    public final Paint f24895l3;
    public int f24896m3;
    public int f24897n3;
    public org.telegram.messenger.q20 f24898o3;
    public org.telegram.messenger.q20 f24899p3;
    public boolean f24900q3;
    public boolean f24901r3;
    public bi.t0 f24902s3;
    public int f24903t3;
    public org.telegram.messenger.q20 f24904u3;
    public float f24905v3;
    public ValueAnimator f24906w3;
    public boolean f24907x3;
    public final t5 y3;
    public final t5 f24908z3;

    static {
        new HashSet();
    }

    public bw0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f24888e3 = 6.5f;
        this.f24889f3 = null;
        gr grVar = gr.h;
        this.f24891h3 = new t5(this, 360L, grVar);
        Paint paint = new Paint(1);
        this.f24895l3 = paint;
        this.f24903t3 = -1;
        this.f24905v3 = 0.0f;
        this.f24907x3 = true;
        this.y3 = new t5(this, 350L, grVar);
        this.f24908z3 = new t5(this, 350L, grVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.i0.L(2.0f), 0);
        sv0 sv0Var = new sv0(this);
        this.f24890g3 = sv0Var;
        setAdapter(sv0Var);
        s4.a0 a0Var = new s4.a0();
        setLayoutManager(a0Var);
        a0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.i0.L(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.ActionBar.a7.m(this, 20, i11, p6Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.f30625n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.d20.f15147s0, Integer.valueOf(i10), new org.telegram.ui.ActionBar.u3(this, currentTimeMillis, 1));
    }

    public static void A1(bw0 bw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        bw0Var.f24889f3 = new xv0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            xv0[] xv0VarArr = bw0Var.f24889f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f32550c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f32548a = "premium";
            } else {
                obj.f32548a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f32549b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            xv0VarArr[i10] = obj;
        }
        bw0Var.f24889f3 = bw0Var.E1(bw0Var.f24889f3);
        bw0Var.f24890g3.f();
        bw0Var.setCategoriesShownT(0.0f);
        boolean z11 = bw0Var.f24907x3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        bw0Var.J1(z11, z10);
    }

    public static void B1(bw0 bw0Var, float f7) {
        bw0Var.setCategoriesShownT(f7);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.i0.L(1.0f);
        if (view instanceof wv0) {
            wv0 wv0Var = (wv0) view;
            f7 = c3.i0.z(1.0f, wv0Var.E, 0.15f, 0.85f) * wv0Var.D;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof wv0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f24896m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f24905v3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof wv0) {
                float s10 = org.telegram.messenger.i0.s(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s10 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((wv0) childAt).j();
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
        int L = (org.telegram.messenger.i0.L(34.0f) * this.f24903t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f24897n3));
        scrollBy(L, 0);
        post(new uo0((vh.o1) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, gr.h);
    }

    public void H1(int i10) {
        boolean z10;
        if (this.f24903t3 < 0 && i10 >= 0) {
            this.f24908z3.e(true, i10);
        }
        this.f24903t3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof wv0) {
                int R = RecyclerView.R(childAt);
                wv0 wv0Var = (wv0) childAt;
                if (this.f24903t3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wv0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(xv0 xv0Var) {
        int i10;
        if (this.f24889f3 != null) {
            i10 = 0;
            while (true) {
                xv0[] xv0VarArr = this.f24889f3;
                if (i10 >= xv0VarArr.length) {
                    break;
                } else if (xv0VarArr[i10] == xv0Var) {
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
        this.f24907x3 = z10;
        ?? r52 = z10;
        if (this.f24889f3 == null) {
            r52 = 0;
        }
        if (this.f24905v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f24906w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24906w3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f24905v3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f24906w3 = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 22));
            this.f24906w3.addListener(new t60(this, 23));
            this.f24906w3.setInterpolator(gr.h);
            ValueAnimator valueAnimator2 = this.f24906w3;
            xv0[] xv0VarArr = this.f24889f3;
            if (xv0VarArr == null) {
                length = 5;
            } else {
                length = xv0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f24906w3.start();
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
            if (!(E instanceof wv0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bw0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f24903t3;
    }

    public xv0 getSelectedCategory() {
        int i10;
        xv0[] xv0VarArr = this.f24889f3;
        if (xv0VarArr != null && (i10 = this.f24903t3) >= 0 && i10 < xv0VarArr.length) {
            return xv0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.q20 q20Var;
        int i11 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof wv0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f24897n3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f24900q3;
        if (z12 != z11) {
            this.f24900q3 = z11;
            org.telegram.messenger.q20 q20Var2 = this.f24898o3;
            if (q20Var2 != null) {
                if (z11) {
                    i11 = Math.max(0, getScrollToStartWidth() - (this.f24896m3 - this.f24897n3));
                }
                q20Var2.a(Integer.valueOf(i11));
            }
            invalidate();
        } else if (z12 && (q20Var = this.f24898o3) != null) {
            q20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f24896m3 - this.f24897n3))));
        }
        if (this.f24901r3 != z10) {
            this.f24901r3 = z10;
            org.telegram.messenger.q20 q20Var3 = this.f24899p3;
            if (q20Var3 != null) {
                q20Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f24907x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.t0 t0Var = this.f24902s3;
        if (t0Var != null) {
            t0Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f24894k3 == null) {
            this.f24894k3 = new Paint(1);
        }
        this.f24894k3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(2131231228).mutate();
        this.f24892i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231227).mutate();
        this.f24893j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f24897n3 = i10;
    }

    public void setOnCategoryClick(org.telegram.messenger.q20 q20Var) {
        this.f24904u3 = q20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.q20 q20Var) {
        this.f24899p3 = q20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.q20 q20Var) {
        this.f24898o3 = q20Var;
    }

    public void setShownButtonsAtStart(float f7) {
        this.f24888e3 = f7;
    }

    @Override
    public final void updateColors() {
        try {
            this.f24895l3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i6, this.f30625n2));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public xv0[] E1(xv0[] xv0VarArr) {
        return xv0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

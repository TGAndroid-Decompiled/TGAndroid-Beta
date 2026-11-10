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
public abstract class zu0 extends pj0 implements org.telegram.ui.ActionBar.c6 {
    public static final xu0 E3 = new org.telegram.messenger.x2();
    public static final yu0 F3 = new org.telegram.messenger.x2();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f41122e3;
    public vu0[] f41123f3;
    public final qu0 f41124g3;
    public final v5 f41125h3;
    public Drawable f41126i3;
    public Drawable j3;
    public Paint f41127k3;
    public final Paint f41128l3;
    public int f41129m3;
    public int f41130n3;
    public org.telegram.messenger.c20 f41131o3;
    public org.telegram.messenger.c20 f41132p3;
    public boolean f41133q3;
    public boolean f41134r3;
    public bi.ec f41135s3;
    public int f41136t3;
    public org.telegram.messenger.c20 f41137u3;
    public float f41138v3;
    public ValueAnimator f41139w3;
    public boolean f41140x3;
    public final v5 f41141y3;
    public final v5 f41142z3;

    static {
        new HashSet();
    }

    public zu0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f41122e3 = 6.5f;
        this.f41123f3 = null;
        wq wqVar = wq.h;
        this.f41125h3 = new v5(this, 360L, wqVar);
        Paint paint = new Paint(1);
        this.f41128l3 = paint;
        this.f41136t3 = -1;
        this.f41138v3 = 0.0f;
        this.f41140x3 = true;
        this.f41141y3 = new v5(this, 350L, wqVar);
        this.f41142z3 = new v5(this, 350L, wqVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        qu0 qu0Var = new qu0(this);
        this.f41124g3 = qu0Var;
        setAdapter(qu0Var);
        v4.b0 b0Var = new v4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.l(this, 20, i10, h6Var);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.f36980n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.p10.f24474s0, Integer.valueOf(i7), new fi.f8(this, currentTimeMillis, 2));
    }

    public static void A1(zu0 zu0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        zu0Var.f41123f3 = new vu0[tL_messages_emojiGroups.groups.size()];
        boolean z9 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            vu0[] vu0VarArr = zu0Var.f41123f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f39749c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f39747a = "premium";
            } else {
                obj.f39747a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f39748b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            vu0VarArr[i7] = obj;
        }
        zu0Var.f41123f3 = zu0Var.E1(zu0Var.f41123f3);
        zu0Var.f41124g3.f();
        zu0Var.setCategoriesShownT(0.0f);
        boolean z10 = zu0Var.f41140x3;
        if (System.currentTimeMillis() - j3 > 16) {
            z9 = true;
        }
        zu0Var.J1(z10, z9);
    }

    public static void B1(zu0 zu0Var, float f10) {
        zu0Var.setCategoriesShownT(f10);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof uu0) {
            uu0 uu0Var = (uu0) view;
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, uu0Var.E, 0.15f, 0.85f) * uu0Var.D;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof uu0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f41129m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f41138v3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof uu0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((uu0) childAt).j();
                }
                childAt.setAlpha(s5);
                childAt.setScaleX(s5);
                childAt.setScaleY(s5);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f41136t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f41130n3));
        scrollBy(L, 0);
        post(new jr0((fi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, wq.h);
    }

    public void H1(int i7) {
        boolean z9;
        if (this.f41136t3 < 0 && i7 >= 0) {
            this.f41142z3.e(true, i7);
        }
        this.f41136t3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof uu0) {
                int R = RecyclerView.R(childAt);
                uu0 uu0Var = (uu0) childAt;
                if (this.f41136t3 == R - 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                uu0Var.l(z9, true);
            }
        }
        invalidate();
    }

    public final void I1(vu0 vu0Var) {
        int i7;
        if (this.f41123f3 != null) {
            i7 = 0;
            while (true) {
                vu0[] vu0VarArr = this.f41123f3;
                if (i7 >= vu0VarArr.length) {
                    break;
                } else if (vu0VarArr[i7] == vu0Var) {
                    break;
                } else {
                    i7++;
                }
            }
            H1(i7);
        }
        i7 = -1;
        H1(i7);
    }

    public final void J1(boolean z9, boolean z10) {
        int length;
        this.f41140x3 = z9;
        ?? r52 = z9;
        if (this.f41123f3 == null) {
            r52 = 0;
        }
        if (this.f41138v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f41139w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41139w3 = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f41138v3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f41139w3 = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 21));
            this.f41139w3.addListener(new e60(this, 23));
            this.f41139w3.setInterpolator(wq.h);
            ValueAnimator valueAnimator2 = this.f41139w3;
            vu0[] vu0VarArr = this.f41123f3;
            if (vu0VarArr == null) {
                length = 5;
            } else {
                length = vu0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f41139w3.start();
            return;
        }
        if (r52 != 0) {
            f10 = 1.0f;
        }
        setCategoriesShownT(f10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof uu0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f41136t3;
    }

    public vu0 getSelectedCategory() {
        int i7;
        vu0[] vu0VarArr = this.f41123f3;
        if (vu0VarArr != null && (i7 = this.f41136t3) >= 0 && i7 < vu0VarArr.length) {
            return vu0VarArr[i7];
        }
        return null;
    }

    @Override
    public final void l0(int i7) {
        boolean z9;
        boolean z10;
        org.telegram.messenger.c20 c20Var;
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z10 = true;
            if (childAt instanceof uu0) {
                z9 = true;
            } else {
                if (childAt.getRight() > this.f41130n3) {
                    z10 = false;
                }
                z9 = false;
            }
        } else {
            z9 = false;
            z10 = false;
        }
        boolean z11 = this.f41133q3;
        if (z11 != z10) {
            this.f41133q3 = z10;
            org.telegram.messenger.c20 c20Var2 = this.f41131o3;
            if (c20Var2 != null) {
                if (z10) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f41129m3 - this.f41130n3));
                }
                c20Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z11 && (c20Var = this.f41131o3) != null) {
            c20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f41129m3 - this.f41130n3))));
        }
        if (this.f41134r3 != z9) {
            this.f41134r3 = z9;
            org.telegram.messenger.c20 c20Var3 = this.f41132p3;
            if (c20Var3 != null) {
                c20Var3.a(Boolean.valueOf(z9));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f41140x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.ec ecVar = this.f41135s3;
        if (ecVar != null) {
            ecVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f41127k3 == null) {
            this.f41127k3 = new Paint(1);
        }
        this.f41127k3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.f41126i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f41130n3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.c20 c20Var) {
        this.f41137u3 = c20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.c20 c20Var) {
        this.f41132p3 = c20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.c20 c20Var) {
        this.f41131o3 = c20Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f41122e3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f41128l3.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, this.f36980n2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public vu0[] E1(vu0[] vu0VarArr) {
        return vu0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public abstract class xu0 extends tj0 implements org.telegram.ui.ActionBar.z5 {
    public static final vu0 F3 = new org.telegram.messenger.x2();
    public static final wu0 G3 = new org.telegram.messenger.x2();
    public final u5 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f40483f3;
    public tu0[] f40484g3;
    public final ou0 f40485h3;
    public final u5 i3;
    public Drawable f40486j3;
    public Drawable f40487k3;
    public Paint f40488l3;
    public final Paint f40489m3;
    public int f40490n3;
    public int f40491o3;
    public org.telegram.messenger.u10 f40492p3;
    public org.telegram.messenger.u10 f40493q3;
    public boolean f40494r3;
    public boolean f40495s3;
    public ai.x2 f40496t3;
    public int f40497u3;
    public org.telegram.messenger.u10 f40498v3;
    public float f40499w3;
    public ValueAnimator f40500x3;
    public boolean f40501y3;
    public final u5 f40502z3;

    static {
        new HashSet();
    }

    public xu0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f40483f3 = 6.5f;
        this.f40484g3 = null;
        xq xqVar = xq.h;
        this.i3 = new u5(this, 360L, xqVar);
        Paint paint = new Paint(1);
        this.f40489m3 = paint;
        this.f40497u3 = -1;
        this.f40499w3 = 0.0f;
        this.f40501y3 = true;
        this.f40502z3 = new u5(this, 350L, xqVar);
        this.A3 = new u5(this, 350L, xqVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        ou0 ou0Var = new ou0(this);
        this.f40485h3 = ou0Var;
        setAdapter(ou0Var);
        u4.b0 b0Var = new u4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i10, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f38460o2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.h10.f22829t0, Integer.valueOf(i3), new gi.e8(this, currentTimeMillis, 2));
    }

    public static void A1(xu0 xu0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j10) {
        xu0Var.f40484g3 = new tu0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i3 = 0; i3 < tL_messages_emojiGroups.groups.size(); i3++) {
            tu0[] tu0VarArr = xu0Var.f40484g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i3);
            ?? obj = new Object();
            obj.f38557c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f38555a = "premium";
            } else {
                obj.f38555a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f38556b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            tu0VarArr[i3] = obj;
        }
        xu0Var.f40484g3 = xu0Var.E1(xu0Var.f40484g3);
        xu0Var.f40485h3.f();
        xu0Var.setCategoriesShownT(0.0f);
        boolean z11 = xu0Var.f40501y3;
        if (System.currentTimeMillis() - j10 > 16) {
            z10 = true;
        }
        xu0Var.J1(z11, z10);
    }

    public static void B1(xu0 xu0Var, float f10) {
        xu0Var.setCategoriesShownT(f10);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof su0) {
            su0 su0Var = (su0) view;
            f10 = com.google.android.recaptcha.internal.a.y(1.0f, su0Var.F, 0.15f, 0.85f) * su0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof su0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f40490n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f40499w3 = f10;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof su0) {
                float s6 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s6 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((su0) childAt).j();
                }
                childAt.setAlpha(s6);
                childAt.setScaleX(s6);
                childAt.setScaleY(s6);
            }
        }
        invalidate();
    }

    public abstract boolean D1();

    public final void F1() {
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f40497u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f40491o3));
        scrollBy(L, 0);
        post(new sp0((gi.c2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, xq.h);
    }

    public void H1(int i3) {
        boolean z10;
        if (this.f40497u3 < 0 && i3 >= 0) {
            this.A3.e(true, i3);
        }
        this.f40497u3 = i3;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof su0) {
                int R = RecyclerView.R(childAt);
                su0 su0Var = (su0) childAt;
                if (this.f40497u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                su0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(tu0 tu0Var) {
        int i3;
        if (this.f40484g3 != null) {
            i3 = 0;
            while (true) {
                tu0[] tu0VarArr = this.f40484g3;
                if (i3 >= tu0VarArr.length) {
                    break;
                } else if (tu0VarArr[i3] == tu0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            H1(i3);
        }
        i3 = -1;
        H1(i3);
    }

    public final void J1(boolean z10, boolean z11) {
        int length;
        this.f40501y3 = z10;
        ?? r5 = z10;
        if (this.f40484g3 == null) {
            r5 = 0;
        }
        if (this.f40499w3 == ((float) r5)) {
            return;
        }
        ValueAnimator valueAnimator = this.f40500x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40500x3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f40499w3;
            if (r5 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f40500x3 = ofFloat;
            ofFloat.addUpdateListener(new y50(this, 22));
            this.f40500x3.addListener(new a60(this, 23));
            this.f40500x3.setInterpolator(xq.h);
            ValueAnimator valueAnimator2 = this.f40500x3;
            tu0[] tu0VarArr = this.f40484g3;
            if (tu0VarArr == null) {
                length = 5;
            } else {
                length = tu0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f40500x3.start();
            return;
        }
        if (r5 != 0) {
            f10 = 1.0f;
        }
        setCategoriesShownT(f10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View E = E(motionEvent.getX(), motionEvent.getY());
            if (!(E instanceof su0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f40497u3;
    }

    public tu0 getSelectedCategory() {
        int i3;
        tu0[] tu0VarArr = this.f40484g3;
        if (tu0VarArr != null && (i3 = this.f40497u3) >= 0 && i3 < tu0VarArr.length) {
            return tu0VarArr[i3];
        }
        return null;
    }

    @Override
    public final void l0(int i3) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.u10 u10Var;
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof su0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f40491o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f40494r3;
        if (z12 != z11) {
            this.f40494r3 = z11;
            org.telegram.messenger.u10 u10Var2 = this.f40492p3;
            if (u10Var2 != null) {
                if (z11) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f40490n3 - this.f40491o3));
                }
                u10Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z12 && (u10Var = this.f40492p3) != null) {
            u10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f40490n3 - this.f40491o3))));
        }
        if (this.f40495s3 != z10) {
            this.f40495s3 = z10;
            org.telegram.messenger.u10 u10Var3 = this.f40493q3;
            if (u10Var3 != null) {
                u10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f40501y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ai.x2 x2Var = this.f40496t3;
        if (x2Var != null) {
            x2Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i3) {
        if (this.f40488l3 == null) {
            this.f40488l3 = new Paint(1);
        }
        this.f40488l3.setColor(i3);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.f40486j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i3, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.f40487k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i3, mode));
    }

    public void setDontOccupyWidth(int i3) {
        this.f40491o3 = i3;
    }

    public void setOnCategoryClick(org.telegram.messenger.u10 u10Var) {
        this.f40498v3 = u10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.u10 u10Var) {
        this.f40493q3 = u10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.u10 u10Var) {
        this.f40492p3 = u10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f40483f3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f40489m3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, this.f38460o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public tu0[] E1(tu0[] tu0VarArr) {
        return tu0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

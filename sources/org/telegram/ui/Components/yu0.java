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
public abstract class yu0 extends pj0 implements org.telegram.ui.ActionBar.a6 {
    public static final wu0 E3 = new org.telegram.messenger.x2();
    public static final xu0 F3 = new org.telegram.messenger.x2();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f40697e3;
    public uu0[] f40698f3;
    public final pu0 f40699g3;
    public final w5 f40700h3;
    public Drawable f40701i3;
    public Drawable j3;
    public Paint f40702k3;
    public final Paint f40703l3;
    public int f40704m3;
    public int f40705n3;
    public org.telegram.messenger.c20 f40706o3;
    public org.telegram.messenger.c20 f40707p3;
    public boolean f40708q3;
    public boolean f40709r3;
    public bi.ec f40710s3;
    public int f40711t3;
    public org.telegram.messenger.c20 f40712u3;
    public float f40713v3;
    public ValueAnimator f40714w3;
    public boolean f40715x3;
    public final w5 f40716y3;
    public final w5 f40717z3;

    static {
        new HashSet();
    }

    public yu0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f40697e3 = 6.5f;
        this.f40698f3 = null;
        xq xqVar = xq.h;
        this.f40700h3 = new w5(this, 360L, xqVar);
        Paint paint = new Paint(1);
        this.f40703l3 = paint;
        this.f40711t3 = -1;
        this.f40713v3 = 0.0f;
        this.f40715x3 = true;
        this.f40716y3 = new w5(this, 350L, xqVar);
        this.f40717z3 = new w5(this, 350L, xqVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        pu0 pu0Var = new pu0(this);
        this.f40699g3 = pu0Var;
        setAdapter(pu0Var);
        v4.b0 b0Var = new v4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.ActionBar.r6.m(this, 20, i10, f6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, this.f37060n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.p10.f24459s0, Integer.valueOf(i7), new fi.f8(this, currentTimeMillis, 2));
    }

    public static void A1(yu0 yu0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        yu0Var.f40698f3 = new uu0[tL_messages_emojiGroups.groups.size()];
        boolean z9 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            uu0[] uu0VarArr = yu0Var.f40698f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f38737c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f38735a = "premium";
            } else {
                obj.f38735a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f38736b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            uu0VarArr[i7] = obj;
        }
        yu0Var.f40698f3 = yu0Var.E1(yu0Var.f40698f3);
        yu0Var.f40699g3.f();
        yu0Var.setCategoriesShownT(0.0f);
        boolean z10 = yu0Var.f40715x3;
        if (System.currentTimeMillis() - j3 > 16) {
            z9 = true;
        }
        yu0Var.J1(z10, z9);
    }

    public static void B1(yu0 yu0Var, float f10) {
        yu0Var.setCategoriesShownT(f10);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof tu0) {
            tu0 tu0Var = (tu0) view;
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, tu0Var.E, 0.15f, 0.85f) * tu0Var.D;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof tu0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f40704m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f40713v3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof tu0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((tu0) childAt).j();
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f40711t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f40705n3));
        scrollBy(L, 0);
        post(new ir0((fi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, xq.h);
    }

    public void H1(int i7) {
        boolean z9;
        if (this.f40711t3 < 0 && i7 >= 0) {
            this.f40717z3.e(true, i7);
        }
        this.f40711t3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tu0) {
                int R = RecyclerView.R(childAt);
                tu0 tu0Var = (tu0) childAt;
                if (this.f40711t3 == R - 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                tu0Var.l(z9, true);
            }
        }
        invalidate();
    }

    public final void I1(uu0 uu0Var) {
        int i7;
        if (this.f40698f3 != null) {
            i7 = 0;
            while (true) {
                uu0[] uu0VarArr = this.f40698f3;
                if (i7 >= uu0VarArr.length) {
                    break;
                } else if (uu0VarArr[i7] == uu0Var) {
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
        this.f40715x3 = z9;
        ?? r52 = z9;
        if (this.f40698f3 == null) {
            r52 = 0;
        }
        if (this.f40713v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f40714w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40714w3 = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f40713v3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f40714w3 = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 21));
            this.f40714w3.addListener(new e60(this, 23));
            this.f40714w3.setInterpolator(xq.h);
            ValueAnimator valueAnimator2 = this.f40714w3;
            uu0[] uu0VarArr = this.f40698f3;
            if (uu0VarArr == null) {
                length = 5;
            } else {
                length = uu0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f40714w3.start();
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
            if (!(E instanceof tu0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f40711t3;
    }

    public uu0 getSelectedCategory() {
        int i7;
        uu0[] uu0VarArr = this.f40698f3;
        if (uu0VarArr != null && (i7 = this.f40711t3) >= 0 && i7 < uu0VarArr.length) {
            return uu0VarArr[i7];
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
            if (childAt instanceof tu0) {
                z9 = true;
            } else {
                if (childAt.getRight() > this.f40705n3) {
                    z10 = false;
                }
                z9 = false;
            }
        } else {
            z9 = false;
            z10 = false;
        }
        boolean z11 = this.f40708q3;
        if (z11 != z10) {
            this.f40708q3 = z10;
            org.telegram.messenger.c20 c20Var2 = this.f40706o3;
            if (c20Var2 != null) {
                if (z10) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f40704m3 - this.f40705n3));
                }
                c20Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z11 && (c20Var = this.f40706o3) != null) {
            c20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f40704m3 - this.f40705n3))));
        }
        if (this.f40709r3 != z9) {
            this.f40709r3 = z9;
            org.telegram.messenger.c20 c20Var3 = this.f40707p3;
            if (c20Var3 != null) {
                c20Var3.a(Boolean.valueOf(z9));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f40715x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.ec ecVar = this.f40710s3;
        if (ecVar != null) {
            ecVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f40702k3 == null) {
            this.f40702k3 = new Paint(1);
        }
        this.f40702k3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.f40701i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f40705n3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.c20 c20Var) {
        this.f40712u3 = c20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.c20 c20Var) {
        this.f40707p3 = c20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.c20 c20Var) {
        this.f40706o3 = c20Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f40697e3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f40703l3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i6, this.f37060n2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public uu0[] E1(uu0[] uu0VarArr) {
        return uu0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

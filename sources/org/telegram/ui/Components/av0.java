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
public abstract class av0 extends uj0 implements org.telegram.ui.ActionBar.z5 {
    public static final yu0 F3 = new org.telegram.messenger.x2();
    public static final zu0 G3 = new org.telegram.messenger.x2();
    public final u5 A3;
    public final RectF B3;
    public final RectF C3;
    public final RectF D3;
    public boolean E3;
    public float f33075f3;
    public wu0[] f33076g3;
    public final ru0 f33077h3;
    public final u5 f33078i3;
    public Drawable j3;
    public Drawable f33079k3;
    public Paint f33080l3;
    public final Paint f33081m3;
    public int f33082n3;
    public int f33083o3;
    public org.telegram.messenger.z10 f33084p3;
    public org.telegram.messenger.z10 f33085q3;
    public boolean f33086r3;
    public boolean f33087s3;
    public bi.o2 f33088t3;
    public int f33089u3;
    public org.telegram.messenger.z10 f33090v3;
    public float f33091w3;
    public ValueAnimator f33092x3;
    public boolean f33093y3;
    public final u5 f33094z3;

    static {
        new HashSet();
    }

    public av0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f33075f3 = 6.5f;
        this.f33076g3 = null;
        er erVar = er.h;
        this.f33078i3 = new u5(this, 360L, erVar);
        Paint paint = new Paint(1);
        this.f33081m3 = paint;
        this.f33089u3 = -1;
        this.f33091w3 = 0.0f;
        this.f33093y3 = true;
        this.f33094z3 = new u5(this, 350L, erVar);
        this.A3 = new u5(this, 350L, erVar);
        this.B3 = new RectF();
        this.C3 = new RectF();
        this.D3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        ru0 ru0Var = new ru0(this);
        this.f33077h3 = ru0Var;
        setAdapter(ru0Var);
        v4.b0 b0Var = new v4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.q6.l(this, 20, i10, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, this.f40069o2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        F3.c(org.telegram.messenger.m10.f24940t0, Integer.valueOf(i7), new hi.d8(this, currentTimeMillis, 3));
    }

    public static void A1(av0 av0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        av0Var.f33076g3 = new wu0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            wu0[] wu0VarArr = av0Var.f33076g3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f41464c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f41462a = "premium";
            } else {
                obj.f41462a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f41463b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            wu0VarArr[i7] = obj;
        }
        av0Var.f33076g3 = av0Var.E1(av0Var.f33076g3);
        av0Var.f33077h3.f();
        av0Var.setCategoriesShownT(0.0f);
        boolean z11 = av0Var.f33093y3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        av0Var.J1(z11, z10);
    }

    public static void B1(av0 av0Var, float f10) {
        av0Var.setCategoriesShownT(f10);
    }

    public static void C1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f10 = 1.0f;
        float width = (view.getWidth() / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        if (view instanceof vu0) {
            vu0 vu0Var = (vu0) view;
            f10 = com.google.android.gms.internal.vision.e2.z(1.0f, vu0Var.F, 0.15f, 0.85f) * vu0Var.E;
        }
        float f11 = width * f10;
        rectF.set(left - f11, top - f11, left + f11, top + f11);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof vu0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f33082n3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f33091w3 = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof vu0) {
                float s5 = org.telegram.messenger.g0.s(f10, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (s5 > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((vu0) childAt).j();
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f33089u3) + ((-getScrollToStartWidth()) - Math.max(0, this.f33083o3));
        scrollBy(L, 0);
        post(new ro0((hi.c2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, er.h);
    }

    public void H1(int i7) {
        boolean z10;
        if (this.f33089u3 < 0 && i7 >= 0) {
            this.A3.e(true, i7);
        }
        this.f33089u3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof vu0) {
                int R = RecyclerView.R(childAt);
                vu0 vu0Var = (vu0) childAt;
                if (this.f33089u3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vu0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void I1(wu0 wu0Var) {
        int i7;
        if (this.f33076g3 != null) {
            i7 = 0;
            while (true) {
                wu0[] wu0VarArr = this.f33076g3;
                if (i7 >= wu0VarArr.length) {
                    break;
                } else if (wu0VarArr[i7] == wu0Var) {
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

    public final void J1(boolean z10, boolean z11) {
        int length;
        this.f33093y3 = z10;
        ?? r52 = z10;
        if (this.f33076g3 == null) {
            r52 = 0;
        }
        if (this.f33091w3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f33092x3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33092x3 = null;
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f33091w3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f33092x3 = ofFloat;
            ofFloat.addUpdateListener(new f60(this, 21));
            this.f33092x3.addListener(new h60(this, 23));
            this.f33092x3.setInterpolator(er.h);
            ValueAnimator valueAnimator2 = this.f33092x3;
            wu0[] wu0VarArr = this.f33076g3;
            if (wu0VarArr == null) {
                length = 5;
            } else {
                length = wu0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f33092x3.start();
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
            if (!(E instanceof vu0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.av0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f33089u3;
    }

    public wu0 getSelectedCategory() {
        int i7;
        wu0[] wu0VarArr = this.f33076g3;
        if (wu0VarArr != null && (i7 = this.f33089u3) >= 0 && i7 < wu0VarArr.length) {
            return wu0VarArr[i7];
        }
        return null;
    }

    @Override
    public final void l0(int i7) {
        boolean z10;
        boolean z11;
        org.telegram.messenger.z10 z10Var;
        int i10 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof vu0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f33083o3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f33086r3;
        if (z12 != z11) {
            this.f33086r3 = z11;
            org.telegram.messenger.z10 z10Var2 = this.f33084p3;
            if (z10Var2 != null) {
                if (z11) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f33082n3 - this.f33083o3));
                }
                z10Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z12 && (z10Var = this.f33084p3) != null) {
            z10Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f33082n3 - this.f33083o3))));
        }
        if (this.f33087s3 != z10) {
            this.f33087s3 = z10;
            org.telegram.messenger.z10 z10Var3 = this.f33085q3;
            if (z10Var3 != null) {
                z10Var3.a(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f33093y3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.o2 o2Var = this.f33088t3;
        if (o2Var != null) {
            o2Var.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f33080l3 == null) {
            this.f33080l3 = new Paint(1);
        }
        this.f33080l3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.j3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.f33079k3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f33083o3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.z10 z10Var) {
        this.f33090v3 = z10Var;
    }

    public void setOnScrollFully(org.telegram.messenger.z10 z10Var) {
        this.f33085q3 = z10Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.z10 z10Var) {
        this.f33084p3 = z10Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f33075f3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f33081m3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, this.f40069o2));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public wu0[] E1(wu0[] wu0VarArr) {
        return wu0VarArr;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

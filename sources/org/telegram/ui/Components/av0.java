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
public abstract class av0 extends qj0 implements org.telegram.ui.ActionBar.b6 {
    public static final yu0 E3 = new org.telegram.messenger.x2();
    public static final zu0 F3 = new org.telegram.messenger.x2();
    public final RectF A3;
    public final RectF B3;
    public final RectF C3;
    public boolean D3;
    public float f31985e3;
    public wu0[] f31986f3;
    public final ru0 f31987g3;
    public final w5 f31988h3;
    public Drawable f31989i3;
    public Drawable j3;
    public Paint f31990k3;
    public final Paint f31991l3;
    public int f31992m3;
    public int f31993n3;
    public org.telegram.messenger.c20 f31994o3;
    public org.telegram.messenger.c20 f31995p3;
    public boolean f31996q3;
    public boolean f31997r3;
    public bi.ec f31998s3;
    public int f31999t3;
    public org.telegram.messenger.c20 f32000u3;
    public float f32001v3;
    public ValueAnimator f32002w3;
    public boolean f32003x3;
    public final w5 f32004y3;
    public final w5 f32005z3;

    static {
        new HashSet();
    }

    public av0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f31985e3 = 6.5f;
        this.f31986f3 = null;
        xq xqVar = xq.h;
        this.f31988h3 = new w5(this, 360L, xqVar);
        Paint paint = new Paint(1);
        this.f31991l3 = paint;
        this.f31999t3 = -1;
        this.f32001v3 = 0.0f;
        this.f32003x3 = true;
        this.f32004y3 = new w5(this, 350L, xqVar);
        this.f32005z3 = new w5(this, 350L, xqVar);
        this.A3 = new RectF();
        this.B3 = new RectF();
        this.C3 = new RectF();
        setPadding(0, 0, org.telegram.messenger.g0.L(2.0f), 0);
        ru0 ru0Var = new ru0(this);
        this.f31987g3 = ru0Var;
        setAdapter(ru0Var);
        v4.b0 b0Var = new v4.b0();
        setLayoutManager(b0Var);
        b0Var.j1(0);
        setSelectorRadius(org.telegram.messenger.g0.L(15.0f));
        setSelectorType(1);
        int i10 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.ActionBar.s6.l(this, 20, i10, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, this.f37381n2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        E3.c(org.telegram.messenger.p10.f24470s0, Integer.valueOf(i7), new fi.f8(this, currentTimeMillis, 2));
    }

    public static void A1(av0 av0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        av0Var.f31986f3 = new wu0[tL_messages_emojiGroups.groups.size()];
        boolean z9 = false;
        for (int i7 = 0; i7 < tL_messages_emojiGroups.groups.size(); i7++) {
            wu0[] wu0VarArr = av0Var.f31986f3;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i7);
            ?? obj = new Object();
            obj.f40167c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f40165a = "premium";
            } else {
                obj.f40165a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f40166b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            wu0VarArr[i7] = obj;
        }
        av0Var.f31986f3 = av0Var.E1(av0Var.f31986f3);
        av0Var.f31987g3.f();
        av0Var.setCategoriesShownT(0.0f);
        boolean z10 = av0Var.f32003x3;
        if (System.currentTimeMillis() - j3 > 16) {
            z9 = true;
        }
        av0Var.J1(z10, z9);
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
            f10 = com.google.android.recaptcha.internal.a.z(1.0f, vu0Var.E, 0.15f, 0.85f) * vu0Var.D;
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
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f31992m3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f10) {
        this.f32001v3 = f10;
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
        int L = (org.telegram.messenger.g0.L(34.0f) * this.f31999t3) + ((-getScrollToStartWidth()) - Math.max(0, this.f31993n3));
        scrollBy(L, 0);
        post(new kr0((fi.d2) this, L));
    }

    public final void G1() {
        w0(-getScrollToStartWidth(), 0, xq.h);
    }

    public void H1(int i7) {
        boolean z9;
        if (this.f31999t3 < 0 && i7 >= 0) {
            this.f32005z3.e(true, i7);
        }
        this.f31999t3 = i7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof vu0) {
                int R = RecyclerView.R(childAt);
                vu0 vu0Var = (vu0) childAt;
                if (this.f31999t3 == R - 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                vu0Var.l(z9, true);
            }
        }
        invalidate();
    }

    public final void I1(wu0 wu0Var) {
        int i7;
        if (this.f31986f3 != null) {
            i7 = 0;
            while (true) {
                wu0[] wu0VarArr = this.f31986f3;
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

    public final void J1(boolean z9, boolean z10) {
        int length;
        this.f32003x3 = z9;
        ?? r52 = z9;
        if (this.f31986f3 == null) {
            r52 = 0;
        }
        if (this.f32001v3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f32002w3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32002w3 = null;
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f32001v3;
            if (r52 != 0) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f32002w3 = ofFloat;
            ofFloat.addUpdateListener(new d60(this, 21));
            this.f32002w3.addListener(new f60(this, 23));
            this.f32002w3.setInterpolator(xq.h);
            ValueAnimator valueAnimator2 = this.f32002w3;
            wu0[] wu0VarArr = this.f31986f3;
            if (wu0VarArr == null) {
                length = 5;
            } else {
                length = wu0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f32002w3.start();
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
        return this.f31999t3;
    }

    public wu0 getSelectedCategory() {
        int i7;
        wu0[] wu0VarArr = this.f31986f3;
        if (wu0VarArr != null && (i7 = this.f31999t3) >= 0 && i7 < wu0VarArr.length) {
            return wu0VarArr[i7];
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
            if (childAt instanceof vu0) {
                z9 = true;
            } else {
                if (childAt.getRight() > this.f31993n3) {
                    z10 = false;
                }
                z9 = false;
            }
        } else {
            z9 = false;
            z10 = false;
        }
        boolean z11 = this.f31996q3;
        if (z11 != z10) {
            this.f31996q3 = z10;
            org.telegram.messenger.c20 c20Var2 = this.f31994o3;
            if (c20Var2 != null) {
                if (z10) {
                    i10 = Math.max(0, getScrollToStartWidth() - (this.f31992m3 - this.f31993n3));
                }
                c20Var2.a(Integer.valueOf(i10));
            }
            invalidate();
        } else if (z11 && (c20Var = this.f31994o3) != null) {
            c20Var.a(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f31992m3 - this.f31993n3))));
        }
        if (this.f31997r3 != z9) {
            this.f31997r3 = z9;
            org.telegram.messenger.c20 c20Var3 = this.f31995p3;
            if (c20Var3 != null) {
                c20Var3.a(Boolean.valueOf(z9));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J1(this.f32003x3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.ec ecVar = this.f31998s3;
        if (ecVar != null) {
            ecVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f31990k3 == null) {
            this.f31990k3 = new Paint(1);
        }
        this.f31990k3.setColor(i7);
        Drawable mutate = getContext().getResources().getDrawable(2131231227).mutate();
        this.f31989i3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131231226).mutate();
        this.j3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
    }

    public void setDontOccupyWidth(int i7) {
        this.f31993n3 = i7;
    }

    public void setOnCategoryClick(org.telegram.messenger.c20 c20Var) {
        this.f32000u3 = c20Var;
    }

    public void setOnScrollFully(org.telegram.messenger.c20 c20Var) {
        this.f31995p3 = c20Var;
    }

    public void setOnScrollIntoOccupiedWidth(org.telegram.messenger.c20 c20Var) {
        this.f31994o3 = c20Var;
    }

    public void setShownButtonsAtStart(float f10) {
        this.f31985e3 = f10;
    }

    @Override
    public final void updateColors() {
        try {
            this.f31991l3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, this.f37381n2));
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

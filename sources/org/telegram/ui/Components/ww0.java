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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class ww0 extends ll0 {
    public static final uw0 f29796x3 = new CacheFetcher();
    public static final vw0 y3 = new CacheFetcher();
    public float X2;
    public sw0[] Y2;
    public final nw0 Z2;
    public final c6 f29797a3;
    public Drawable f29798b3;
    public Drawable f29799c3;
    public Paint f29800d3;
    public final Paint f29801e3;
    public int f29802f3;
    public int f29803g3;
    public Utilities.Callback f29804h3;
    public Utilities.Callback f29805i3;
    public boolean j3;
    public boolean f29806k3;
    public ci.eb f29807l3;
    public int f29808m3;
    public Utilities.Callback f29809n3;
    public float f29810o3;
    public ValueAnimator f29811p3;
    public boolean f29812q3;
    public final c6 f29813r3;
    public final c6 f29814s3;
    public final RectF f29815t3;
    public final RectF f29816u3;
    public final RectF f29817v3;
    public boolean f29818w3;

    static {
        new HashSet();
    }

    public ww0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.f29797a3 = new c6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.f29801e3 = paint;
        this.f29808m3 = -1;
        this.f29810o3 = 0.0f;
        this.f29812q3 = true;
        this.f29813r3 = new c6(this, 350L, qrVar);
        this.f29814s3 = new c6(this, 350L, qrVar);
        this.f29815t3 = new RectF();
        this.f29816u3 = new RectF();
        this.f29817v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        nw0 nw0Var = new nw0(this);
        this.Z2 = nw0Var;
        setAdapter(nw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.i6.f18923i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f25969p2));
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f25969p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f29796x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof rw0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f29802f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f29810o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof rw0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((rw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void x1(ww0 ww0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        ww0Var.Y2 = new sw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            sw0[] sw0VarArr = ww0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f27982c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f27980a = "premium";
            } else {
                obj.f27980a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f27981b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            sw0VarArr[i10] = obj;
        }
        ww0Var.Y2 = ww0Var.B1(ww0Var.Y2);
        ww0Var.Z2.l();
        ww0Var.setCategoriesShownT(0.0f);
        boolean z11 = ww0Var.f29812q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        ww0Var.G1(z11, z10);
    }

    public static void y1(ww0 ww0Var, float f7) {
        ww0Var.setCategoriesShownT(f7);
    }

    public static void z1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof rw0) {
            rw0 rw0Var = (rw0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, rw0Var.E, 0.15f, 0.85f) * rw0Var.f27697y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public abstract boolean A1();

    public final void C1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f29808m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f29803g3));
        scrollBy(dp, 0);
        post(new id((ci.k2) this, dp, 10));
    }

    public final void D1() {
        v0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void E1(int i10) {
        boolean z10;
        if (this.f29808m3 < 0 && i10 >= 0) {
            this.f29814s3.d(i10, true);
        }
        this.f29808m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof rw0) {
                int R = RecyclerView.R(childAt);
                rw0 rw0Var = (rw0) childAt;
                if (this.f29808m3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rw0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void F1(sw0 sw0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                sw0[] sw0VarArr = this.Y2;
                if (i10 >= sw0VarArr.length) {
                    break;
                } else if (sw0VarArr[i10] == sw0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            E1(i10);
        }
        i10 = -1;
        E1(i10);
    }

    public final void G1(boolean z10, boolean z11) {
        int length;
        this.f29812q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f29810o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f29811p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29811p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f29810o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29811p3 = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 23));
            this.f29811p3.addListener(new jd0(this, 16));
            this.f29811p3.setInterpolator(qr.h);
            ValueAnimator valueAnimator2 = this.f29811p3;
            sw0[] sw0VarArr = this.Y2;
            if (sw0VarArr == null) {
                length = 5;
            } else {
                length = sw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f29811p3.start();
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
            if (!(E instanceof rw0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ww0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f29808m3;
    }

    public sw0 getSelectedCategory() {
        int i10;
        sw0[] sw0VarArr = this.Y2;
        if (sw0VarArr != null && (i10 = this.f29808m3) >= 0 && i10 < sw0VarArr.length) {
            return sw0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void k0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof rw0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f29803g3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.j3;
        if (z12 != z11) {
            this.j3 = z11;
            Utilities.Callback callback2 = this.f29804h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f29802f3 - this.f29803g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f29804h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f29802f3 - this.f29803g3))));
        }
        if (this.f29806k3 != z10) {
            this.f29806k3 = z10;
            Utilities.Callback callback3 = this.f29805i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        G1(this.f29812q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.f29807l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f29800d3 == null) {
            this.f29800d3 = new Paint(1);
        }
        this.f29800d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f29798b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f29799c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f29803g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<sw0> callback) {
        this.f29809n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f29805i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f29804h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public sw0[] B1(sw0[] sw0VarArr) {
        return sw0VarArr;
    }
}

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
public abstract class zx0 extends rm0 {
    public static final xx0 f33728v3 = new CacheFetcher();
    public static final yx0 f33729w3 = new CacheFetcher();
    public float V2;
    public vx0[] W2;
    public final qx0 X2;
    public final g6 Y2;
    public Drawable Z2;
    public Drawable f33730a3;
    public Paint f33731b3;
    public final Paint f33732c3;
    public int f33733d3;
    public int f33734e3;
    public Utilities.Callback f33735f3;
    public Utilities.Callback f33736g3;
    public boolean f33737h3;
    public boolean f33738i3;
    public ci.bb j3;
    public int f33739k3;
    public Utilities.Callback f33740l3;
    public float f33741m3;
    public ValueAnimator f33742n3;
    public boolean f33743o3;
    public final g6 f33744p3;
    public final g6 f33745q3;
    public final RectF f33746r3;
    public final RectF f33747s3;
    public final RectF f33748t3;
    public boolean f33749u3;

    static {
        new HashSet();
    }

    public zx0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = 6.5f;
        this.W2 = null;
        is isVar = is.h;
        this.Y2 = new g6(this, 360L, isVar);
        Paint paint = new Paint(1);
        this.f33732c3 = paint;
        this.f33739k3 = -1;
        this.f33741m3 = 0.0f;
        this.f33743o3 = true;
        this.f33744p3 = new g6(this, 350L, isVar);
        this.f33745q3 = new g6(this, 350L, isVar);
        this.f33746r3 = new RectF();
        this.f33747s3 = new RectF();
        this.f33748t3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        qx0 qx0Var = new qx0(this);
        this.X2 = qx0Var;
        setAdapter(qx0Var);
        s4.d0 d0Var = new s4.d0();
        setLayoutManager(d0Var);
        d0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.h6.f20913i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f30570n2));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f30570n2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f33728v3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.p9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof ux0) {
            ux0 ux0Var = (ux0) view;
            f7 = com.google.android.gms.internal.vision.e2.y(1.0f, ux0Var.E, 0.15f, 0.85f) * ux0Var.f31744y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof ux0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f33733d3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f33741m3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ux0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((ux0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(zx0 zx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        zx0Var.W2 = new vx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            vx0[] vx0VarArr = zx0Var.W2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f32567c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f32565a = "premium";
            } else {
                obj.f32565a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f32566b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            vx0VarArr[i10] = obj;
        }
        zx0Var.W2 = zx0Var.C1(zx0Var.W2);
        zx0Var.X2.l();
        zx0Var.setCategoriesShownT(0.0f);
        boolean z11 = zx0Var.f33743o3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        zx0Var.H1(z11, z10);
    }

    public static void z1(zx0 zx0Var, float f7) {
        zx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f33739k3) + ((-getScrollToStartWidth()) - Math.max(0, this.f33734e3));
        scrollBy(dp, 0);
        post(new nd((ci.j2) this, dp, 11));
    }

    public final void E1() {
        v0(-getScrollToStartWidth(), 0, is.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f33739k3 < 0 && i10 >= 0) {
            this.f33745q3.d(i10, true);
        }
        this.f33739k3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ux0) {
                int R = RecyclerView.R(childAt);
                ux0 ux0Var = (ux0) childAt;
                if (this.f33739k3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ux0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(vx0 vx0Var) {
        int i10;
        if (this.W2 != null) {
            i10 = 0;
            while (true) {
                vx0[] vx0VarArr = this.W2;
                if (i10 >= vx0VarArr.length) {
                    break;
                } else if (vx0VarArr[i10] == vx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            F1(i10);
        }
        i10 = -1;
        F1(i10);
    }

    public final void H1(boolean z10, boolean z11) {
        int length;
        this.f33743o3 = z10;
        ?? r52 = z10;
        if (this.W2 == null) {
            r52 = 0;
        }
        if (this.f33741m3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f33742n3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33742n3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f33741m3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f33742n3 = ofFloat;
            ofFloat.addUpdateListener(new j80(this, 24));
            this.f33742n3.addListener(new vd0(this, 17));
            this.f33742n3.setInterpolator(is.h);
            ValueAnimator valueAnimator2 = this.f33742n3;
            vx0[] vx0VarArr = this.W2;
            if (vx0VarArr == null) {
                length = 5;
            } else {
                length = vx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f33742n3.start();
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
            if (!(E instanceof ux0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f33739k3;
    }

    public vx0 getSelectedCategory() {
        int i10;
        vx0[] vx0VarArr = this.W2;
        if (vx0VarArr != null && (i10 = this.f33739k3) >= 0 && i10 < vx0VarArr.length) {
            return vx0VarArr[i10];
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
            if (childAt instanceof ux0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f33734e3) {
                    z11 = false;
                }
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = this.f33737h3;
        if (z12 != z11) {
            this.f33737h3 = z11;
            Utilities.Callback callback2 = this.f33735f3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f33733d3 - this.f33734e3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f33735f3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f33733d3 - this.f33734e3))));
        }
        if (this.f33738i3 != z10) {
            this.f33738i3 = z10;
            Utilities.Callback callback3 = this.f33736g3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f33743o3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.bb bbVar = this.j3;
        if (bbVar != null) {
            bbVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f33731b3 == null) {
            this.f33731b3 = new Paint(1);
        }
        this.f33731b3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.Z2 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f33730a3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f33734e3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<vx0> callback) {
        this.f33740l3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f33736g3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f33735f3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.V2 = f7;
    }

    public vx0[] C1(vx0[] vx0VarArr) {
        return vx0VarArr;
    }
}

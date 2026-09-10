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
public abstract class hx0 extends vl0 {
    public static final fx0 f23776x3 = new CacheFetcher();
    public static final gx0 y3 = new CacheFetcher();
    public float X2;
    public dx0[] Y2;
    public final yw0 Z2;
    public final d6 f23777a3;
    public Drawable f23778b3;
    public Drawable f23779c3;
    public Paint f23780d3;
    public final Paint f23781e3;
    public int f23782f3;
    public int f23783g3;
    public Utilities.Callback f23784h3;
    public Utilities.Callback f23785i3;
    public boolean j3;
    public boolean f23786k3;
    public bi.nc f23787l3;
    public int f23788m3;
    public Utilities.Callback f23789n3;
    public float f23790o3;
    public ValueAnimator f23791p3;
    public boolean f23792q3;
    public final d6 f23793r3;
    public final d6 f23794s3;
    public final RectF f23795t3;
    public final RectF f23796u3;
    public final RectF f23797v3;
    public boolean f23798w3;

    static {
        new HashSet();
    }

    public hx0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        wr wrVar = wr.h;
        this.f23777a3 = new d6(this, 360L, wrVar);
        Paint paint = new Paint(1);
        this.f23781e3 = paint;
        this.f23788m3 = -1;
        this.f23790o3 = 0.0f;
        this.f23792q3 = true;
        this.f23793r3 = new d6(this, 350L, wrVar);
        this.f23794s3 = new d6(this, 350L, wrVar);
        this.f23795t3 = new RectF();
        this.f23796u3 = new RectF();
        this.f23797v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        yw0 yw0Var = new yw0(this);
        this.Z2 = yw0Var;
        setAdapter(yw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f18017i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f27987p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f27987p2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f23776x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new bi.ab(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof cx0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f23782f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f23790o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof cx0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((cx0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void w1(hx0 hx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        hx0Var.Y2 = new dx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            dx0[] dx0VarArr = hx0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f22497c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f22495a = "premium";
            } else {
                obj.f22495a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f22496b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            dx0VarArr[i10] = obj;
        }
        hx0Var.Y2 = hx0Var.A1(hx0Var.Y2);
        hx0Var.Z2.l();
        hx0Var.setCategoriesShownT(0.0f);
        boolean z11 = hx0Var.f23792q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        hx0Var.F1(z11, z10);
    }

    public static void y1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof cx0) {
            cx0 cx0Var = (cx0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, cx0Var.E, 0.15f, 0.85f) * cx0Var.f22246y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public final void B1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f23788m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f23783g3));
        scrollBy(dp, 0);
        post(new zd((bi.w2) this, dp, 9));
    }

    public final void C1() {
        v0(-getScrollToStartWidth(), 0, wr.h);
    }

    public void D1(int i10) {
        boolean z10;
        if (this.f23788m3 < 0 && i10 >= 0) {
            this.f23794s3.d(i10, true);
        }
        this.f23788m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof cx0) {
                int R = RecyclerView.R(childAt);
                cx0 cx0Var = (cx0) childAt;
                if (this.f23788m3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cx0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void E1(dx0 dx0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                dx0[] dx0VarArr = this.Y2;
                if (i10 >= dx0VarArr.length) {
                    break;
                } else if (dx0VarArr[i10] == dx0Var) {
                    break;
                } else {
                    i10++;
                }
            }
            D1(i10);
        }
        i10 = -1;
        D1(i10);
    }

    public final void F1(boolean z10, boolean z11) {
        int length;
        this.f23792q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f23790o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f23791p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f23791p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f23790o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f23791p3 = ofFloat;
            ofFloat.addUpdateListener(new q70(this, 23));
            this.f23791p3.addListener(new zn0(this, 6));
            this.f23791p3.setInterpolator(wr.h);
            ValueAnimator valueAnimator2 = this.f23791p3;
            dx0[] dx0VarArr = this.Y2;
            if (dx0VarArr == null) {
                length = 5;
            } else {
                length = dx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f23791p3.start();
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
            if (!(E instanceof cx0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f23788m3;
    }

    public dx0 getSelectedCategory() {
        int i10;
        dx0[] dx0VarArr = this.Y2;
        if (dx0VarArr != null && (i10 = this.f23788m3) >= 0 && i10 < dx0VarArr.length) {
            return dx0VarArr[i10];
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
            if (childAt instanceof cx0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f23783g3) {
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
            Utilities.Callback callback2 = this.f23784h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f23782f3 - this.f23783g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f23784h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f23782f3 - this.f23783g3))));
        }
        if (this.f23786k3 != z10) {
            this.f23786k3 = z10;
            Utilities.Callback callback3 = this.f23785i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1(this.f23792q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bi.nc ncVar = this.f23787l3;
        if (ncVar != null) {
            ncVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f23780d3 == null) {
            this.f23780d3 = new Paint(1);
        }
        this.f23780d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f23778b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f23779c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f23783g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<dx0> callback) {
        this.f23789n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f23785i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f23784h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public abstract boolean z1();

    public dx0[] A1(dx0[] dx0VarArr) {
        return dx0VarArr;
    }
}

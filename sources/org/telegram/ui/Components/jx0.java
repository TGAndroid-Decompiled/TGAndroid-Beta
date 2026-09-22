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
public abstract class jx0 extends yl0 {
    public static final hx0 f25490x3 = new CacheFetcher();
    public static final ix0 y3 = new CacheFetcher();
    public float X2;
    public fx0[] Y2;
    public final ax0 Z2;
    public final d6 f25491a3;
    public Drawable f25492b3;
    public Drawable f25493c3;
    public Paint f25494d3;
    public final Paint f25495e3;
    public int f25496f3;
    public int f25497g3;
    public Utilities.Callback f25498h3;
    public Utilities.Callback f25499i3;
    public boolean j3;
    public boolean f25500k3;
    public ci.eb f25501l3;
    public int f25502m3;
    public Utilities.Callback f25503n3;
    public float f25504o3;
    public ValueAnimator f25505p3;
    public boolean f25506q3;
    public final d6 f25507r3;
    public final d6 f25508s3;
    public final RectF f25509t3;
    public final RectF f25510u3;
    public final RectF f25511v3;
    public boolean f25512w3;

    static {
        new HashSet();
    }

    public jx0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        qr qrVar = qr.h;
        this.f25491a3 = new d6(this, 360L, qrVar);
        Paint paint = new Paint(1);
        this.f25495e3 = paint;
        this.f25502m3 = -1;
        this.f25504o3 = 0.0f;
        this.f25506q3 = true;
        this.f25507r3 = new d6(this, 350L, qrVar);
        this.f25508s3 = new d6(this, 350L, qrVar);
        this.f25509t3 = new RectF();
        this.f25510u3 = new RectF();
        this.f25511v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        ax0 ax0Var = new ax0(this);
        this.Z2 = ax0Var;
        setAdapter(ax0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f19199i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f30704p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f30704p2));
        setWillNotDraw(false);
        setOnItemClickListener(new j(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f25490x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new ci.s9(this, currentTimeMillis, 2));
    }

    public static void A1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof ex0) {
            ex0 ex0Var = (ex0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, ex0Var.E, 0.15f, 0.85f) * ex0Var.f24055y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof ex0) {
            return Math.max(0, getHeight() * (RecyclerView.S(childAt) - 1)) + this.f25496f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f25504o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ex0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.S(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((ex0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void y1(jx0 jx0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        jx0Var.Y2 = new fx0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            fx0[] fx0VarArr = jx0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f24372c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f24370a = "premium";
            } else {
                obj.f24370a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f24371b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            fx0VarArr[i10] = obj;
        }
        jx0Var.Y2 = jx0Var.C1(jx0Var.Y2);
        jx0Var.Z2.l();
        jx0Var.setCategoriesShownT(0.0f);
        boolean z11 = jx0Var.f25506q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        jx0Var.H1(z11, z10);
    }

    public static void z1(jx0 jx0Var, float f7) {
        jx0Var.setCategoriesShownT(f7);
    }

    public abstract boolean B1();

    public final void D1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f25502m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f25497g3));
        scrollBy(dp, 0);
        post(new kd((ci.k2) this, dp, 10));
    }

    public final void E1() {
        w0(-getScrollToStartWidth(), 0, qr.h);
    }

    public void F1(int i10) {
        boolean z10;
        if (this.f25502m3 < 0 && i10 >= 0) {
            this.f25508s3.d(i10, true);
        }
        this.f25502m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ex0) {
                int S = RecyclerView.S(childAt);
                ex0 ex0Var = (ex0) childAt;
                if (this.f25502m3 == S - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ex0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void G1(fx0 fx0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                fx0[] fx0VarArr = this.Y2;
                if (i10 >= fx0VarArr.length) {
                    break;
                } else if (fx0VarArr[i10] == fx0Var) {
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
        this.f25506q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f25504o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f25505p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25505p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f25504o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f25505p3 = ofFloat;
            ofFloat.addUpdateListener(new s70(this, 23));
            this.f25505p3.addListener(new gd0(this, 17));
            this.f25505p3.setInterpolator(qr.h);
            ValueAnimator valueAnimator2 = this.f25505p3;
            fx0[] fx0VarArr = this.Y2;
            if (fx0VarArr == null) {
                length = 5;
            } else {
                length = fx0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f25505p3.start();
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
            View F = F(motionEvent.getX(), motionEvent.getY());
            if (!(F instanceof ex0) || F.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jx0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f25502m3;
    }

    public fx0 getSelectedCategory() {
        int i10;
        fx0[] fx0VarArr = this.Y2;
        if (fx0VarArr != null && (i10 = this.f25502m3) >= 0 && i10 < fx0VarArr.length) {
            return fx0VarArr[i10];
        }
        return null;
    }

    @Override
    public final void l0(int i10, int i11) {
        boolean z10;
        boolean z11;
        Utilities.Callback callback;
        int i12 = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            z11 = true;
            if (childAt instanceof ex0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f25497g3) {
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
            Utilities.Callback callback2 = this.f25498h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f25496f3 - this.f25497g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f25498h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f25496f3 - this.f25497g3))));
        }
        if (this.f25500k3 != z10) {
            this.f25500k3 = z10;
            Utilities.Callback callback3 = this.f25499i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        H1(this.f25506q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci.eb ebVar = this.f25501l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f25494d3 == null) {
            this.f25494d3 = new Paint(1);
        }
        this.f25494d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f25492b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f25493c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f25497g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<fx0> callback) {
        this.f25503n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f25499i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f25498h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public fx0[] C1(fx0[] fx0VarArr) {
        return fx0VarArr;
    }
}

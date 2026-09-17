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
public abstract class vw0 extends ll0 {
    public static final tw0 f32021x3 = new CacheFetcher();
    public static final uw0 y3 = new CacheFetcher();
    public float X2;
    public rw0[] Y2;
    public final mw0 Z2;
    public final e6 f32022a3;
    public Drawable f32023b3;
    public Drawable f32024c3;
    public Paint f32025d3;
    public final Paint f32026e3;
    public int f32027f3;
    public int f32028g3;
    public Utilities.Callback f32029h3;
    public Utilities.Callback f32030i3;
    public boolean j3;
    public boolean f32031k3;
    public di.eb f32032l3;
    public int f32033m3;
    public Utilities.Callback f32034n3;
    public float f32035o3;
    public ValueAnimator f32036p3;
    public boolean f32037q3;
    public final e6 f32038r3;
    public final e6 f32039s3;
    public final RectF f32040t3;
    public final RectF f32041u3;
    public final RectF f32042v3;
    public boolean f32043w3;

    static {
        new HashSet();
    }

    public vw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.X2 = 6.5f;
        this.Y2 = null;
        pr prVar = pr.h;
        this.f32022a3 = new e6(this, 360L, prVar);
        Paint paint = new Paint(1);
        this.f32026e3 = paint;
        this.f32033m3 = -1;
        this.f32035o3 = 0.0f;
        this.f32037q3 = true;
        this.f32038r3 = new e6(this, 350L, prVar);
        this.f32039s3 = new e6(this, 350L, prVar);
        this.f32040t3 = new RectF();
        this.f32041u3 = new RectF();
        this.f32042v3 = new RectF();
        setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
        mw0 mw0Var = new mw0(this);
        this.Z2 = mw0Var;
        setAdapter(mw0Var);
        s4.c0 c0Var = new s4.c0();
        setLayoutManager(c0Var);
        c0Var.j1(0);
        setSelectorRadius(AndroidUtilities.dp(15.0f));
        setSelectorType(1);
        int i11 = org.telegram.ui.ActionBar.j6.f20781i6;
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f28252p2));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f28252p2));
        setWillNotDraw(false);
        setOnItemClickListener(new k(this, 15));
        long currentTimeMillis = System.currentTimeMillis();
        f32021x3.fetch(UserConfig.selectedAccount, Integer.valueOf(i10), new di.r9(this, currentTimeMillis, 2));
    }

    private int getScrollToStartWidth() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof qw0) {
            return Math.max(0, getHeight() * (RecyclerView.R(childAt) - 1)) + this.f32027f3 + (-childAt.getLeft());
        }
        return -childAt.getLeft();
    }

    public void setCategoriesShownT(float f7) {
        this.f32035o3 = f7;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof qw0) {
                float cascade = AndroidUtilities.cascade(f7, (getChildCount() - 1) - RecyclerView.R(childAt), getChildCount() - 1, 3.0f);
                if (cascade > 0.0f && childAt.getAlpha() <= 0.0f) {
                    ((qw0) childAt).j();
                }
                childAt.setAlpha(cascade);
                childAt.setScaleX(cascade);
                childAt.setScaleY(cascade);
            }
        }
        invalidate();
    }

    public static void w1(vw0 vw0Var, TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups, long j3) {
        vw0Var.Y2 = new rw0[tL_messages_emojiGroups.groups.size()];
        boolean z10 = false;
        for (int i10 = 0; i10 < tL_messages_emojiGroups.groups.size(); i10++) {
            rw0[] rw0VarArr = vw0Var.Y2;
            TLRPC.EmojiGroup emojiGroup = tL_messages_emojiGroups.groups.get(i10);
            ?? obj = new Object();
            obj.f30135c = emojiGroup.icon_emoji_id;
            if (emojiGroup instanceof TLRPC.TL_emojiGroupPremium) {
                obj.f30133a = "premium";
            } else {
                obj.f30133a = TextUtils.concat((CharSequence[]) emojiGroup.emoticons.toArray(new String[0])).toString();
            }
            obj.f30134b = emojiGroup instanceof TLRPC.TL_emojiGroupGreeting;
            obj.d = emojiGroup.title;
            rw0VarArr[i10] = obj;
        }
        vw0Var.Y2 = vw0Var.A1(vw0Var.Y2);
        vw0Var.Z2.l();
        vw0Var.setCategoriesShownT(0.0f);
        boolean z11 = vw0Var.f32037q3;
        if (System.currentTimeMillis() - j3 > 16) {
            z10 = true;
        }
        vw0Var.F1(z11, z10);
    }

    public static void x1(vw0 vw0Var, float f7) {
        vw0Var.setCategoriesShownT(f7);
    }

    public static void y1(RectF rectF, View view) {
        float left = (view.getLeft() + view.getRight()) / 2.0f;
        float top = (view.getTop() + view.getBottom()) / 2.0f;
        float f7 = 1.0f;
        float width = (view.getWidth() / 2.0f) - AndroidUtilities.dp(1.0f);
        if (view instanceof qw0) {
            qw0 qw0Var = (qw0) view;
            f7 = com.google.android.gms.internal.vision.e2.z(1.0f, qw0Var.E, 0.15f, 0.85f) * qw0Var.f29859y;
        }
        float f10 = width * f7;
        rectF.set(left - f10, top - f10, left + f10, top + f10);
    }

    public final void B1() {
        int dp = (AndroidUtilities.dp(34.0f) * this.f32033m3) + ((-getScrollToStartWidth()) - Math.max(0, this.f32028g3));
        scrollBy(dp, 0);
        post(new m8((di.k2) this, dp, 11));
    }

    public final void C1() {
        v0(-getScrollToStartWidth(), 0, pr.h);
    }

    public void D1(int i10) {
        boolean z10;
        if (this.f32033m3 < 0 && i10 >= 0) {
            this.f32039s3.d(i10, true);
        }
        this.f32033m3 = i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof qw0) {
                int R = RecyclerView.R(childAt);
                qw0 qw0Var = (qw0) childAt;
                if (this.f32033m3 == R - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qw0Var.l(z10, true);
            }
        }
        invalidate();
    }

    public final void E1(rw0 rw0Var) {
        int i10;
        if (this.Y2 != null) {
            i10 = 0;
            while (true) {
                rw0[] rw0VarArr = this.Y2;
                if (i10 >= rw0VarArr.length) {
                    break;
                } else if (rw0VarArr[i10] == rw0Var) {
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
        this.f32037q3 = z10;
        ?? r52 = z10;
        if (this.Y2 == null) {
            r52 = 0;
        }
        if (this.f32035o3 == ((float) r52)) {
            return;
        }
        ValueAnimator valueAnimator = this.f32036p3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32036p3 = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f32035o3;
            if (r52 != 0) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32036p3 = ofFloat;
            ofFloat.addUpdateListener(new h70(this, 23));
            this.f32036p3.addListener(new r80(this, 19));
            this.f32036p3.setInterpolator(pr.h);
            ValueAnimator valueAnimator2 = this.f32036p3;
            rw0[] rw0VarArr = this.Y2;
            if (rw0VarArr == null) {
                length = 5;
            } else {
                length = rw0VarArr.length;
            }
            valueAnimator2.setDuration(length * 120);
            this.f32036p3.start();
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
            if (!(E instanceof qw0) || E.getAlpha() < 0.5f) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw0.draw(android.graphics.Canvas):void");
    }

    public int getCategoryIndex() {
        return this.f32033m3;
    }

    public rw0 getSelectedCategory() {
        int i10;
        rw0[] rw0VarArr = this.Y2;
        if (rw0VarArr != null && (i10 = this.f32033m3) >= 0 && i10 < rw0VarArr.length) {
            return rw0VarArr[i10];
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
            if (childAt instanceof qw0) {
                z10 = true;
            } else {
                if (childAt.getRight() > this.f32028g3) {
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
            Utilities.Callback callback2 = this.f32029h3;
            if (callback2 != null) {
                if (z11) {
                    i12 = Math.max(0, getScrollToStartWidth() - (this.f32027f3 - this.f32028g3));
                }
                callback2.run(Integer.valueOf(i12));
            }
            invalidate();
        } else if (z12 && (callback = this.f32029h3) != null) {
            callback.run(Integer.valueOf(Math.max(0, getScrollToStartWidth() - (this.f32027f3 - this.f32028g3))));
        }
        if (this.f32031k3 != z10) {
            this.f32031k3 = z10;
            Utilities.Callback callback3 = this.f32030i3;
            if (callback3 != null) {
                callback3.run(Boolean.valueOf(z10));
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F1(this.f32037q3, false);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        di.eb ebVar = this.f32032l3;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f32025d3 == null) {
            this.f32025d3 = new Paint(1);
        }
        this.f32025d3.setColor(i10);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.gradient_right).mutate();
        this.f32023b3 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(i10, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.f32024c3 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public void setDontOccupyWidth(int i10) {
        this.f32028g3 = i10;
    }

    public void setOnCategoryClick(Utilities.Callback<rw0> callback) {
        this.f32034n3 = callback;
    }

    public void setOnScrollFully(Utilities.Callback<Boolean> callback) {
        this.f32030i3 = callback;
    }

    public void setOnScrollIntoOccupiedWidth(Utilities.Callback<Integer> callback) {
        this.f32029h3 = callback;
    }

    public void setShownButtonsAtStart(float f7) {
        this.X2 = f7;
    }

    public abstract boolean z1();

    public rw0[] A1(rw0[] rw0VarArr) {
        return rw0VarArr;
    }
}

package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class fk0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.b1 f28430g1 = new org.telegram.ui.Cells.b1(Float.class, "transitionProgress", 2);
    public final float A;
    public boolean A0;
    public final float B;
    public boolean B0;
    public int C;
    public boolean C0;
    public MessageObject D;
    public final Paint D0;
    public boolean E;
    public final Paint E0;
    public int F;
    public mo F0;
    public long G;
    public boolean G0;
    public boolean H;
    public final AnimationNotificationsLocker H0;
    public boolean I;
    public final int I0;
    public boolean J;
    public boolean J0;
    public float K;
    public boolean K0;
    public long L;
    public Runnable L0;
    public ValueAnimator M;
    public boolean M0;
    public FrameLayout N;
    public y80 N0;
    public bg.d1 O;
    public int O0;
    public final ArrayList P;
    public int P0;
    public final ArrayList Q;
    public float Q0;
    public final ArrayList R;
    public float R0;
    public final org.telegram.ui.vq S;
    public ng.d S0;
    public final vj0 T;
    public ng.d T0;
    public final RectF U;
    public ng.d U0;
    public boolean V;
    public lg.a V0;
    public final HashSet W;
    public og.d W0;
    public boolean X0;
    public boolean Y0;
    public mo Z0;
    public boolean f28431a;
    public final HashSet f28432a0;
    public boolean f28433a1;
    public final jh.e1 f28434b;
    public final int[] f28435b0;
    public boolean f28436b1;
    public final float f28437c;
    public ek0 f28438c0;
    public boolean f28439c1;
    public final ArrayList d;
    public final Rect f28440d0;
    public Paint f28441d1;
    public final ArrayList f28442e;
    public final Drawable f28443e0;
    public Matrix f28444e1;
    public final Paint f28445f;
    public final boolean f28446f0;
    public LinearGradient f28447f1;
    public final org.telegram.ui.ActionBar.c6 f28448g0;
    public final Paint h;
    public kg.q0 f28449h0;
    public int f28450i0;
    public float f28451j0;
    public float f28452k0;
    public float f28453l0;
    public float m0;
    public final Paint f28454n;
    public boolean f28455n0;
    public long f28456o0;
    public org.telegram.ui.ActionBar.o2 f28457p0;
    public cg.t1 f28458q0;
    public float f28459r;
    public lr f28460r0;
    public float f28461s;
    public float f28462s0;
    public kg.d0 f28463t0;
    public ValueAnimator f28464u0;
    public float v;
    public final dk0 f28465v0;
    public final RectF f28466w;
    public boolean f28467w0;
    public final Path f28468x;
    public float f28469x0;
    public float f28470y;
    public final HashSet f28471y0;
    public final HashSet f28472z0;

    public fk0(int i10, int i11, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28431a = false;
        this.d = new ArrayList();
        this.f28442e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f28445f = paint;
        this.h = new Paint(1);
        this.f28454n = new Paint(1);
        this.v = 1.0f;
        this.f28466w = new RectF();
        this.f28468x = new Path();
        this.f28470y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.A = dp;
        this.B = dp / 2.0f;
        this.C = AndroidUtilities.dp(36.0f);
        this.P = new ArrayList(20);
        this.Q = new ArrayList(10);
        this.R = new ArrayList(20);
        this.U = new RectF();
        this.V = false;
        this.W = new HashSet();
        this.f28432a0 = new HashSet();
        this.f28435b0 = new int[2];
        Rect rect = new Rect();
        this.f28440d0 = rect;
        new ArrayList();
        this.f28471y0 = new HashSet();
        this.f28472z0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.D0 = paint2;
        Paint paint3 = new Paint(1);
        this.E0 = paint3;
        this.H0 = new AnimationNotificationsLocker();
        this.K0 = true;
        this.f28436b1 = false;
        this.I0 = i10;
        this.f28437c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Jj, c6Var));
        this.f28448g0 = c6Var;
        this.F = i11;
        this.f28457p0 = o2Var;
        dk0 dk0Var = new dk0(this, context);
        this.f28465v0 = dk0Var;
        dk0Var.setVisibility(8);
        dk0Var.K = false;
        dk0Var.f27796c.setVisibility(8);
        addView(dk0Var);
        this.f28446f0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f28443e0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Td, false), PorterDuff.Mode.MULTIPLY));
        jh.e1 e1Var = new jh.e1(this, context, 17);
        this.f28434b = e1Var;
        e1Var.setClipChildren(false);
        e1Var.setClipToPadding(false);
        org.telegram.ui.vq vqVar = new org.telegram.ui.vq((ViewGroup) this, 3);
        this.S = vqVar;
        e1Var.i(new sj0(this, 0));
        e1Var.setLayoutManager(vqVar);
        e1Var.setOverScrollMode(2);
        vj0 vj0Var = new vj0(this);
        this.T = vj0Var;
        e1Var.setAdapter(vj0Var);
        e1Var.j(new zj0(this));
        e1Var.j(new h00(this, 4));
        e1Var.i(new sj0(this, 1));
        e1Var.setOnItemClickListener(new k(this, 11));
        e1Var.setOnItemLongClickListener((bl0) new eg.n2(this, i10, 7));
        addView(e1Var, i7.f6.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (e1Var.getLayoutParams().height - e1Var.getPaddingTop()) - e1Var.getPaddingBottom();
        dk0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        dk0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(fk0 fk0Var) {
        if (fk0Var.f28463t0 != null) {
            return;
        }
        kg.d0 d0Var = new kg.d0(fk0Var.I0, fk0Var.f28457p0, fk0Var.R, fk0Var.W, fk0Var, fk0Var.f28448g0, fk0Var.f28431a);
        fk0Var.f28463t0 = d0Var;
        lg.a aVar = fk0Var.V0;
        boolean z10 = true;
        if (aVar != null) {
            og.d dVar = fk0Var.W0;
            org.telegram.ui.u41 u41Var = d0Var.f13691m.f37321b0;
            u41Var.f42280x = true;
            u41Var.setBackground(null);
            u41Var.e();
            u41Var.invalidate();
            ng.d c3 = aVar.c(d0Var.f13681a, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            d0Var.f13703z = c3;
        }
        kg.d0 d0Var2 = fk0Var.f28463t0;
        ek0 ek0Var = fk0Var.f28438c0;
        if (ek0Var != null && !ek0Var.j()) {
            z10 = false;
        }
        d0Var2.f13691m.setLongPressEnabled(z10);
        fk0Var.j();
        fk0Var.f28463t0.f13694p = new xb0(fk0Var, 16);
        fk0Var.m();
    }

    public static void b(fk0 fk0Var, View view, float f9) {
        if (view instanceof dk0) {
            ((dk0) view).h = f9;
            return;
        }
        view.setScaleX(f9);
        view.setScaleY(f9);
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        boolean z10 = true;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        kg.q0 d = kg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
                        if (z10 || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i12 = 0;
            while (i12 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i12)))) {
                    longSparseArray.removeAt(i12);
                    i12--;
                }
                i12++;
            }
            i10++;
            z10 = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
            if (longSparseArray.valueAt(i13) != null) {
                hashSet2.add((kg.q0) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        kg.d0 d0Var = this.f28463t0;
        if (d0Var != null) {
            if (!d0Var.f13695q) {
                d0Var.f13695q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new kg.y(d0Var, 0));
                ofFloat.addListener(new kg.b0(d0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f28463t0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22393id == this.G && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.D, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.I0 == 4) {
                invalidate();
                jh.e1 e1Var = this.f28434b;
                e1Var.invalidate();
                e1Var.f1();
                for (int i12 = 0; i12 < e1Var.getChildCount(); i12++) {
                    View childAt = e1Var.getChildAt(i12);
                    if (childAt instanceof dk0) {
                        dk0 dk0Var = (dk0) childAt;
                        dk0Var.f27794a.invalidate();
                        dk0Var.f27795b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i10 == NotificationCenter.availableEffectsUpdate) {
            p(this.D, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        kg.d0 d0Var = this.f28463t0;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    public final void f(float f9, float f10, float f11, int i10, Canvas canvas) {
        int i11;
        float height;
        float f12;
        float f13;
        float height2;
        if (this.I0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.H;
        RectF rectF = this.f28466w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), jr.f29800f.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            jr jrVar = jr.f29800f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, jrVar.getInterpolation(this.K)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), jrVar.getInterpolation(this.K)));
        }
        if (!LocaleController.isRTL && !this.I) {
            i11 = getWidth() - this.C;
        } else {
            i11 = this.C;
        }
        float f15 = i11 + this.Q0;
        if (this.H) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f28443e0;
        drawable.setAlpha(i10);
        Paint paint = this.f28445f;
        paint.setAlpha(i10);
        float f16 = f15 - f9;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f9;
        float f20 = f15 + f9;
        float f21 = height + f9;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean O = this.f28438c0.O();
        float f22 = height;
        RectF rectF2 = this.U;
        if (O) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f9;
            this.f28438c0.G(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f9;
            if (this.T0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f16, f19, f20, f21);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.T0.setBounds(rect);
                this.T0.setAlpha(paint.getAlpha());
                this.T0.draw(canvas);
            } else {
                canvas.drawCircle(f15, f22, f12, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f23 = this.A;
        if (!z11 && !this.I) {
            f13 = (getWidth() - this.C) + f23;
        } else {
            f13 = this.C - f23;
        }
        float f24 = this.Q0 + this.R0 + f13;
        boolean z12 = this.H;
        float f25 = this.B;
        if (z12) {
            height2 = (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f);
        } else {
            height2 = ((getHeight() - f25) - f17) + g();
        }
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), jr.f29800f.getInterpolation(this.K));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f28438c0.O()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f28438c0.G(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.U0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.U0.setBounds(rect2);
            this.U0.setAlpha(paint.getAlpha());
            this.U0.draw(canvas);
        } else {
            canvas.drawCircle(f24, lerp, f11, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float g() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public ek0 getDelegate() {
        return this.f28438c0;
    }

    public int getHintTextWidth() {
        return this.O0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.P.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.f28469x0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public kg.d0 getReactionsWindow() {
        return this.f28463t0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f9;
        HashSet hashSet = this.W;
        if (hashSet.isEmpty()) {
            return "";
        }
        kg.q0 q0Var = (kg.q0) hashSet.iterator().next();
        long j10 = q0Var.f13826g;
        String str = null;
        if (j10 != 0 && (f9 = p5.f(this.F, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f9, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = q0Var.f13825f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<kg.q0> getSelectedReactions() {
        return this.W;
    }

    public float getTopOffset() {
        if (this.M0) {
            return ((FrameLayout.LayoutParams) this.f28434b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + com.google.android.recaptcha.internal.a.f(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<kg.q0> getVisibleReactionsList() {
        return this.P;
    }

    public int getWindowType() {
        int i10 = this.I0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        if (this.B0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        kg.d0 d0Var = this.f28463t0;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f13683c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.I0;
        if (i11 == 4) {
            Iterator it = this.W.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                kg.q0 q0Var = (kg.q0) it.next();
                if (!hashSet.contains(q0Var)) {
                    hashSet.add(q0Var);
                    arrayList.add(q0Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                kg.q0 c3 = kg.q0.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c3)) {
                    hashSet.add(c3);
                    arrayList.add(c3);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
        } else if (this.A0 && i11 != 4) {
            if (i11 == 5) {
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.F).getAvailableEffects();
                if (availableEffects != null) {
                    while (i10 < availableEffects.effects.size()) {
                        kg.q0 e10 = kg.q0.e(availableEffects.effects.get(i10));
                        if (!hashSet.contains(e10)) {
                            hashSet.add(e10);
                            arrayList.add(e10);
                        }
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (i11 == 3) {
                topReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            } else {
                topReactions = MediaDataController.getInstance(this.F).getTopReactions();
            }
            if (i11 == 3) {
                TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.F).getSavedReactionTags(0L);
                if (savedReactionTags != null) {
                    for (int i13 = 0; i13 < savedReactionTags.tags.size(); i13++) {
                        kg.q0 d = kg.q0.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    kg.q0 d10 = kg.q0.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    kg.q0 d11 = kg.q0.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.F).isPremium() || d11.f13826g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.F).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.F).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    kg.q0 d12 = kg.q0.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    kg.q0 c6 = kg.q0.c(enabledReactionsList2.get(i10));
                    if (!hashSet.contains(c6)) {
                        hashSet.add(c6);
                        arrayList.add(c6);
                    }
                    i10++;
                }
            }
        } else if (i11 == 3) {
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.F).getSavedReactions();
            int i17 = 0;
            while (i10 < savedReactions.size()) {
                kg.q0 d13 = kg.q0.d(savedReactions.get(i10));
                if (!hashSet.contains(d13)) {
                    hashSet.add(d13);
                    arrayList.add(d13);
                    i17++;
                }
                if (i17 != 16) {
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.F).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                arrayList.add(kg.q0.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            jh.e1 e1Var = this.f28434b;
            if (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                if (childAt instanceof dk0) {
                    ((dk0) childAt).f27795b.invalidate();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, w02, 0, tileMode));
        this.f28454n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, w02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, kg.q0 q0Var, boolean z10) {
        ek0 ek0Var = this.f28438c0;
        if (ek0Var != null) {
            ek0Var.Q(view, q0Var, z10, true);
        }
        if (this.I0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.K0 = true;
        this.f28450i0 = 0;
        this.f28451j0 = 0.0f;
        this.f28469x0 = 0.0f;
        this.f28449h0 = null;
        this.f28455n0 = false;
        rj0 rj0Var = new rj0(this, 1);
        jh.e1 e1Var = this.f28434b;
        AndroidUtilities.forEachViews((RecyclerView) e1Var, (f5.d) rj0Var);
        this.f28471y0.clear();
        e1Var.invalidate();
        bg.d1 d1Var = this.O;
        if (d1Var != null) {
            d1Var.invalidate();
        }
        invalidate();
    }

    public final void o(lg.a aVar, og.d dVar) {
        this.V0 = aVar;
        this.W0 = dVar;
        ng.d c3 = aVar.c(this, null, true);
        c3.n(dVar);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(8.0f));
        this.S0 = c3;
        ng.d c6 = aVar.c(this, null, true);
        c6.n(dVar);
        c6.p(AndroidUtilities.dp(8.0f));
        c6.o(AndroidUtilities.dp(8.0f));
        this.T0 = c6;
        ng.d c10 = aVar.c(this, null, true);
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(4.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        this.U0 = c10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.I0 == 5) {
            NotificationCenter.getInstance(this.F).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        k();
    }

    public final void p(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i11;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.D = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i10 = 0;
            int i12 = 0;
            while (i12 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i12);
                i12++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i10++;
                }
            }
        } else {
            i10 = 0;
        }
        int i13 = this.I0;
        if (i13 == 0 && this.D != null && i10 >= MessagesController.getInstance(this.F).getChatMaxUniqReactions(this.D.getDialogId())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.E = z11;
        if (i13 == 0 && this.D != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.F).getChat(Long.valueOf(-this.D.getDialogId())))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f28467w0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.F).getChatFull(-messageObject.getFromChatId())) == null) {
            this.G = -messageObject.getFromChatId();
            MessagesController.getInstance(this.F).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.V = false;
        if (i13 == 3) {
            this.A0 = UserConfig.getInstance(this.F).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.A0 = true;
            h(arrayList2);
        } else if (this.E) {
            this.A0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.V = true;
                ?? obj = new Object();
                obj.f13821a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.D.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(kg.q0.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.V = true;
                ?? obj2 = new Object();
                obj2.f13821a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.F).getChat(Long.valueOf(chatFull.f22393id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.A0 = true;
                } else {
                    this.A0 = false;
                }
                h(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i15);
                    i15++;
                    TLRPC.Reaction reaction2 = reaction;
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.F).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(kg.q0.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(kg.q0.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.A0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((kg.q0) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.E && ((!this.A0 && arrayList2.size() > 16) || (this.A0 && !UserConfig.getInstance(this.F).isPremium() && MessagesController.getInstance(this.F).premiumFeaturesBlocked()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.B0 = z13;
        if (i13 == 3 && !UserConfig.getInstance(this.F).isPremium()) {
            this.B0 = false;
        }
        if (i13 == 4) {
            this.B0 = true;
        }
        ArrayList arrayList5 = this.P;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i17 = 0;
            while (i17 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((kg.q0) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                dk0.a(this.f28465v0, (kg.q0) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.C0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((kg.q0) arrayList5.get(i18)).f13826g != 0) {
                this.C0 = false;
            }
        }
        ArrayList arrayList6 = this.R;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        vj0 vj0Var = this.T;
        fk0 fk0Var = vj0Var.d;
        ArrayList arrayList7 = fk0Var.f28442e;
        ArrayList arrayList8 = fk0Var.P;
        ArrayList arrayList9 = fk0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            kg.q0 q0Var = (kg.q0) arrayList8.get(i19);
            if (q0Var.f13825f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new wj0(i11, q0Var));
        }
        if (!fk0Var.Q.isEmpty() && !MessagesController.getInstance(fk0Var.F).premiumFeaturesBlocked()) {
            arrayList9.add(new wj0(1, null));
        }
        if (fk0Var.q()) {
            arrayList9.add(new wj0(2, null));
        }
        if (z10) {
            vj0Var.E(arrayList7, arrayList9);
        } else {
            vj0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.W.add(kg.q0.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.A0 && !this.B0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.G0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.H0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.b1 b1Var = f28430g1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, b1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new nh.a5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f9) {
        if (getAlpha() != f9 && f9 == 0.0f) {
            this.f28471y0.clear();
            int i10 = 0;
            while (true) {
                jh.e1 e1Var = this.f28434b;
                if (i10 >= e1Var.getChildCount()) {
                    break;
                }
                if (e1Var.getChildAt(i10) instanceof dk0) {
                    ((dk0) e1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f9);
    }

    public void setBubbleOffset(float f9) {
        this.Q0 = f9;
    }

    public void setChatScrimView(mo moVar) {
        this.Z0 = moVar;
    }

    public void setCurrentAccount(int i10) {
        this.F = i10;
    }

    public void setCustomEmojiEnterProgress(float f9) {
        this.f28462s0 = f9;
        mo moVar = this.Z0;
        if (moVar != null) {
            moVar.setPopupAlpha(1.0f - f9);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f28460r0.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 40)));
        } else {
            this.f28460r0.setBackground(null);
        }
    }

    public void setDelegate(ek0 ek0Var) {
        this.f28438c0 = ek0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f28457p0 = o2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.M0 = true;
        if (this.N0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.f28448g0;
            y80 y80Var = new y80(context, c6Var);
            this.N0 = y80Var;
            y80Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.N0.setClickable(true);
            this.N0.setTextSize(1, 12.0f);
            int i10 = this.I0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
            } else {
                this.N0.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                this.N0.setAlpha(0.5f);
            }
            this.N0.setGravity(1);
            addView(this.N0, i7.f6.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.N0.setText(charSequence);
        this.f28433a1 = false;
        ((FrameLayout.LayoutParams) this.f28465v0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f28434b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f9) {
        this.R0 = f9;
    }

    public void setMirrorX(boolean z10) {
        this.I = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.L0 = runnable;
    }

    public void setParentLayout(mo moVar) {
        this.F0 = moVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            kg.q0 b10 = kg.q0.b(str);
            hashSet.add(b10);
            this.f28432a0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28434b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReaction(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        this.T.l();
    }

    public void setSelectedReactionAnimated(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28434b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReactionInclusive(kg.q0 q0Var) {
        HashSet hashSet = this.W;
        hashSet.clear();
        if (q0Var != null) {
            hashSet.add(q0Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f28434b, (f5.d) new rj0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.W;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(kg.q0.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.T.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.W;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f28434b, (f5.d) new rj0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.Y0 != z10) {
            this.Y0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    jh.e1 e1Var = this.f28434b;
                    if (i10 >= e1Var.getChildCount()) {
                        break;
                    }
                    if (e1Var.getChildAt(i10) instanceof dk0) {
                        dk0 dk0Var = (dk0) e1Var.getChildAt(i10);
                        boolean z11 = dk0Var.f27800r;
                        ck0 ck0Var = dk0Var.f27795b;
                        if (z11 && (ck0Var.getImageReceiver().getLottieAnimation() != null || ck0Var.getImageReceiver().getAnimation() != null)) {
                            ck0Var.setVisibility(0);
                            dk0Var.f27794a.setVisibility(4);
                            if (dk0Var.f27801s) {
                                dk0Var.v = true;
                            }
                        }
                        dk0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.W;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(kg.q0.d(reaction));
        }
        this.T.l();
    }

    public void setTop(boolean z10) {
        this.H = z10;
    }

    public void setTransitionProgress(float f9) {
        this.v = f9;
        mo moVar = this.F0;
        if (moVar != null) {
            moVar.setReactionsTransitionProgress((this.G0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f9) {
        if (f9 != getTranslationX()) {
            super.setTranslationX(f9);
        }
    }

    public void m() {
    }
}

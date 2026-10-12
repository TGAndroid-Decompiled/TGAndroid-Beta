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
public class gl0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final org.telegram.ui.Cells.d1 f25316k1 = new org.telegram.ui.Cells.d1(Float.class, "transitionProgress", 2);
    public boolean A0;
    public float B0;
    public final HashSet C0;
    public final HashSet D0;
    public final float E;
    public boolean E0;
    public final float F;
    public boolean F0;
    public int G;
    public boolean G0;
    public MessageObject H;
    public final Paint H0;
    public boolean I;
    public final Paint I0;
    public int J;
    public fp J0;
    public long K;
    public boolean K0;
    public boolean L;
    public final AnimationNotificationsLocker L0;
    public boolean M;
    public final int M0;
    public boolean N;
    public boolean N0;
    public float O;
    public boolean O0;
    public long P;
    public Runnable P0;
    public ValueAnimator Q;
    public boolean Q0;
    public FrameLayout R;
    public da0 R0;
    public ah.v S;
    public int S0;
    public final ArrayList T;
    public int T0;
    public final ArrayList U;
    public float U0;
    public final ArrayList V;
    public float V0;
    public final hg.i0 W;
    public dh.d W0;
    public dh.d X0;
    public dh.d Y0;
    public bh.b Z0;
    public boolean f25317a;
    public final wk0 f25318a0;
    public eh.e f25319a1;
    public final bi.o0 f25320b;
    public final RectF f25321b0;
    public boolean f25322b1;
    public final float f25323c;
    public boolean f25324c0;
    public boolean f25325c1;
    public final ArrayList d;
    public final HashSet f25326d0;
    public fp f25327d1;
    public final ArrayList e;
    public final HashSet f25328e0;
    public boolean f25329e1;
    public final Paint f25330f;
    public final int[] f25331f0;
    public boolean f25332f1;
    public fl0 f25333g0;
    public boolean f25334g1;
    public final Paint h;
    public final Rect f25335h0;
    public Paint f25336h1;
    public final Drawable f25337i0;
    public Matrix f25338i1;
    public final boolean f25339j0;
    public LinearGradient f25340j1;
    public final org.telegram.ui.ActionBar.c6 f25341k0;
    public ah.i1 f25342l0;
    public int m0;
    public final Paint f25343n;
    public float f25344n0;
    public float f25345o0;
    public float f25346p0;
    public float f25347q0;
    public float f25348r;
    public boolean f25349r0;
    public float f25350s;
    public long f25351s0;
    public org.telegram.ui.ActionBar.m2 f25352t0;
    public sg.c1 f25353u0;
    public float v;
    public gs f25354v0;
    public final RectF f25355w;
    public float f25356w0;
    public final Path f25357x;
    public ah.t0 f25358x0;
    public float f25359y;
    public ValueAnimator f25360y0;
    public final el0 f25361z0;

    public gl0(int i10, int i11, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25317a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f25330f = paint;
        this.h = new Paint(1);
        this.f25343n = new Paint(1);
        this.v = 1.0f;
        this.f25355w = new RectF();
        this.f25357x = new Path();
        this.f25359y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f25321b0 = new RectF();
        this.f25324c0 = false;
        this.f25326d0 = new HashSet();
        this.f25328e0 = new HashSet();
        this.f25331f0 = new int[2];
        Rect rect = new Rect();
        this.f25335h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f25332f1 = false;
        this.M0 = i10;
        this.f25323c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var));
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Jj, c6Var));
        this.f25341k0 = c6Var;
        this.J = i11;
        this.f25352t0 = m2Var;
        el0 el0Var = new el0(this, context);
        this.f25361z0 = el0Var;
        el0Var.setVisibility(8);
        el0Var.O = false;
        el0Var.f24732c.setVisibility(8);
        addView(el0Var);
        this.f25339j0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : z10;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f25337i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Td, false), PorterDuff.Mode.MULTIPLY));
        bi.o0 o0Var = new bi.o0(this, context, 18);
        this.f25320b = o0Var;
        o0Var.setClipChildren(false);
        o0Var.setClipToPadding(false);
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        o0Var.i(new tk0(this, 0));
        o0Var.setLayoutManager(i0Var);
        o0Var.setOverScrollMode(2);
        wk0 wk0Var = new wk0(this);
        this.f25318a0 = wk0Var;
        o0Var.setAdapter(wk0Var);
        o0Var.j(new al0(this));
        o0Var.j(new kc0(this, 2));
        o0Var.i(new tk0(this, 1));
        o0Var.setOnItemClickListener(new j(this, 11));
        o0Var.setOnItemLongClickListener((cm0) new i2.r(this, i10, 9));
        addView(o0Var, w7.a6.d(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (o0Var.getLayoutParams().height - o0Var.getPaddingTop()) - o0Var.getPaddingBottom();
        el0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        el0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, c6Var));
        } else {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(gl0 gl0Var) {
        if (gl0Var.f25358x0 != null) {
            return;
        }
        ah.t0 t0Var = new ah.t0(gl0Var.M0, gl0Var.f25352t0, gl0Var.V, gl0Var.f25326d0, gl0Var, gl0Var.f25341k0, gl0Var.f25317a);
        gl0Var.f25358x0 = t0Var;
        bh.b bVar = gl0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            eh.e eVar = gl0Var.f25319a1;
            org.telegram.ui.i61 i61Var = t0Var.f873m.f39633f0;
            i61Var.f36335x = true;
            i61Var.setBackground(null);
            i61Var.d();
            i61Var.invalidate();
            dh.d c10 = bVar.c(t0Var.f864a, null, true);
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            t0Var.f885z = c10;
        }
        ah.t0 t0Var2 = gl0Var.f25358x0;
        fl0 fl0Var = gl0Var.f25333g0;
        if (fl0Var != null && !fl0Var.i()) {
            z10 = false;
        }
        t0Var2.f873m.setLongPressEnabled(z10);
        gl0Var.j();
        gl0Var.f25358x0.f876p = new yc0(gl0Var, 17);
        gl0Var.m();
    }

    public static void b(gl0 gl0Var, View view, float f7) {
        if (view instanceof el0) {
            ((el0) view).h = f7;
            return;
        }
        view.setScaleX(f7);
        view.setScaleY(f7);
    }

    public static boolean c() {
        return SharedConfig.deviceIsHigh();
    }

    public static HashSet i(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        ah.i1 d = ah.i1.d(messageObject.messageOwner.reactions.results.get(i11).reaction);
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
                hashSet2.add((ah.i1) longSparseArray.valueAt(i13));
            }
        }
        return hashSet2;
    }

    public final void d() {
        ah.t0 t0Var = this.f25358x0;
        if (t0Var != null) {
            if (!t0Var.f877q) {
                t0Var.f877q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.j0(t0Var, 0));
                ofFloat.addListener(new ah.r0(t0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f25358x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19217id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.M0 == 4) {
                invalidate();
                bi.o0 o0Var = this.f25320b;
                o0Var.invalidate();
                o0Var.f1();
                for (int i12 = 0; i12 < o0Var.getChildCount(); i12++) {
                    View childAt = o0Var.getChildAt(i12);
                    if (childAt instanceof el0) {
                        el0 el0Var = (el0) childAt;
                        el0Var.f24730a.invalidate();
                        el0Var.f24731b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i10 == NotificationCenter.availableEffectsUpdate) {
            p(this.H, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gl0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ah.t0 t0Var = this.f25358x0;
        if (t0Var != null) {
            t0Var.d();
        }
    }

    public final void f(float f7, float f10, float f11, int i10, Canvas canvas) {
        int i11;
        float height;
        float f12;
        float f13;
        float height2;
        if (this.M0 == 1) {
            return;
        }
        canvas.save();
        boolean z10 = this.L;
        RectF rectF = this.f25355w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), es.f24771f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            es esVar = es.f24771f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, esVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), esVar.getInterpolation(this.O)));
        }
        if (!LocaleController.isRTL && !this.M) {
            i11 = getWidth() - this.G;
        } else {
            i11 = this.G;
        }
        float f15 = i11 + this.U0;
        if (this.L) {
            height = getPaddingTop() - g();
        } else {
            height = (getHeight() - getPaddingBottom()) + g();
        }
        int dp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.f25337i0;
        drawable.setAlpha(i10);
        Paint paint = this.f25330f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean D = this.f25333g0.D();
        float f22 = height;
        RectF rectF2 = this.f25321b0;
        if (D) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f25333g0.w(canvas, rectF2, f12, getX(), getY(), i10, false);
        } else {
            f12 = f7;
            if (this.X0 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f16, f19, f20, f21);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.X0.setBounds(rect);
                this.X0.setAlpha(paint.getAlpha());
                this.X0.draw(canvas);
            } else {
                canvas.drawCircle(f15, f22, f12, paint);
            }
        }
        boolean z11 = LocaleController.isRTL;
        float f23 = this.E;
        if (!z11 && !this.M) {
            f13 = (getWidth() - this.G) + f23;
        } else {
            f13 = this.G - f23;
        }
        float f24 = this.U0 + this.V0 + f13;
        boolean z12 = this.L;
        float f25 = this.F;
        if (z12) {
            height2 = (getPaddingTop() - g()) - AndroidUtilities.dp(16.0f);
        } else {
            height2 = ((getHeight() - f25) - f17) + g();
        }
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), es.f24771f.getInterpolation(this.O));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f25333g0.D()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f25333g0.w(canvas, rectF2, f11, getX(), getY(), i10, false);
        } else if (this.Y0 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.Y0.setBounds(rect2);
            this.Y0.setAlpha(paint.getAlpha());
            this.Y0.draw(canvas);
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

    public fl0 getDelegate() {
        return this.f25333g0;
    }

    public int getHintTextWidth() {
        return this.S0;
    }

    public int getItemsCount() {
        return (q() ? 1 : 0) + this.T.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.B0 / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public ah.t0 getReactionsWindow() {
        return this.f25358x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.f25326d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ah.i1 i1Var = (ah.i1) hashSet.iterator().next();
        long j10 = i1Var.f780g;
        String str = null;
        if (j10 != 0 && (f7 = s5.f(this.J, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = i1Var.f779f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ah.i1> getSelectedReactions() {
        return this.f25326d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f25320b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!q()) {
            return AndroidUtilities.dp(16.0f) + com.google.android.gms.internal.play_billing.k3.v(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public List<ah.i1> getVisibleReactionsList() {
        return this.T;
    }

    public int getWindowType() {
        int i10 = this.M0;
        if (i10 == 4) {
            return 13;
        }
        if (i10 == 3) {
            return 11;
        }
        if (i10 == 5) {
            return 14;
        }
        if (this.F0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        ah.t0 t0Var = this.f25358x0;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f866c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f25326d0.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                ah.i1 i1Var = (ah.i1) it.next();
                if (!hashSet.contains(i1Var)) {
                    hashSet.add(i1Var);
                    arrayList.add(i1Var);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList.size()) {
                ah.i1 c10 = ah.i1.c(enabledReactionsList.get(i10));
                if (!hashSet.contains(c10)) {
                    hashSet.add(c10);
                    arrayList.add(c10);
                    i12++;
                    if (i12 >= 8) {
                        return;
                    }
                }
                i10++;
            }
        } else if (this.E0 && i11 != 4) {
            if (i11 == 5) {
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.J).getAvailableEffects();
                if (availableEffects != null) {
                    while (i10 < availableEffects.effects.size()) {
                        ah.i1 e = ah.i1.e(availableEffects.effects.get(i10));
                        if (!hashSet.contains(e)) {
                            hashSet.add(e);
                            arrayList.add(e);
                        }
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (i11 == 3) {
                topReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            } else {
                topReactions = MediaDataController.getInstance(this.J).getTopReactions();
            }
            if (i11 == 3) {
                TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.J).getSavedReactionTags(0L);
                if (savedReactionTags != null) {
                    for (int i13 = 0; i13 < savedReactionTags.tags.size(); i13++) {
                        ah.i1 d = ah.i1.d(savedReactionTags.tags.get(i13).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i14 = 0; i14 < topReactions.size(); i14++) {
                    ah.i1 d10 = ah.i1.d(topReactions.get(i14));
                    if (!hashSet.contains(d10)) {
                        hashSet.add(d10);
                        arrayList.add(d10);
                    }
                }
            } else {
                for (int i15 = 0; i15 < topReactions.size(); i15++) {
                    ah.i1 d11 = ah.i1.d(topReactions.get(i15));
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d11.f780g == 0)) {
                        hashSet.add(d11);
                        arrayList.add(d11);
                    }
                }
            }
            if (i11 != 3 || UserConfig.getInstance(this.J).isPremium()) {
                ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.J).getRecentReactions();
                for (int i16 = 0; i16 < recentReactions.size(); i16++) {
                    ah.i1 d12 = ah.i1.d(recentReactions.get(i16));
                    if (!hashSet.contains(d12)) {
                        hashSet.add(d12);
                        arrayList.add(d12);
                    }
                }
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
                while (i10 < enabledReactionsList2.size()) {
                    ah.i1 c11 = ah.i1.c(enabledReactionsList2.get(i10));
                    if (!hashSet.contains(c11)) {
                        hashSet.add(c11);
                        arrayList.add(c11);
                    }
                    i10++;
                }
            }
        } else if (i11 == 3) {
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.J).getSavedReactions();
            int i17 = 0;
            while (i10 < savedReactions.size()) {
                ah.i1 d13 = ah.i1.d(savedReactions.get(i10));
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
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.J).getEnabledReactionsList();
            while (i10 < enabledReactionsList3.size()) {
                arrayList.add(ah.i1.c(enabledReactionsList3.get(i10)));
                i10++;
            }
        }
    }

    public void j() {
        int i10 = 0;
        while (true) {
            bi.o0 o0Var = this.f25320b;
            if (i10 < o0Var.getChildCount()) {
                View childAt = o0Var.getChildAt(i10);
                if (childAt instanceof el0) {
                    ((el0) childAt).f24731b.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, x02, 0, tileMode));
        this.f25343n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ah.i1 i1Var, boolean z10) {
        fl0 fl0Var = this.f25333g0;
        if (fl0Var != null) {
            fl0Var.r(view, i1Var, z10, true);
        }
        if (this.M0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void n() {
        this.O0 = true;
        this.m0 = 0;
        this.f25344n0 = 0.0f;
        this.B0 = 0.0f;
        this.f25342l0 = null;
        this.f25349r0 = false;
        sk0 sk0Var = new sk0(this, 1);
        bi.o0 o0Var = this.f25320b;
        AndroidUtilities.forEachViews((RecyclerView) o0Var, (Utilities.Callback<View>) sk0Var);
        this.C0.clear();
        o0Var.invalidate();
        ah.v vVar = this.S;
        if (vVar != null) {
            vVar.invalidate();
        }
        invalidate();
    }

    public final void o(bh.b bVar, eh.e eVar) {
        this.Z0 = bVar;
        this.f25319a1 = eVar;
        dh.d c10 = bVar.c(this, null, true);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(8.0f));
        this.W0 = c10;
        dh.d c11 = bVar.c(this, null, true);
        c11.o(eVar);
        c11.q(AndroidUtilities.dp(8.0f));
        c11.p(AndroidUtilities.dp(8.0f));
        this.X0 = c11;
        dh.d c12 = bVar.c(this, null, true);
        c12.o(eVar);
        c12.q(AndroidUtilities.dp(4.0f));
        c12.p(AndroidUtilities.dp(8.0f));
        this.Y0 = c12;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.M0 == 5) {
            NotificationCenter.getInstance(this.J).removeObserver(this, NotificationCenter.availableEffectsUpdate);
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
        this.H = messageObject;
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
        int i13 = this.M0;
        if (i13 == 0 && this.H != null && i10 >= MessagesController.getInstance(this.J).getChatMaxUniqReactions(this.H.getDialogId())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.I = z11;
        if (i13 == 0 && this.H != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.J).getChat(Long.valueOf(-this.H.getDialogId())))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.A0 = z12;
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.J).getChatFull(-messageObject.getFromChatId())) == null) {
            this.K = -messageObject.getFromChatId();
            MessagesController.getInstance(this.J).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.f25324c0 = false;
        if (i13 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.f25324c0 = true;
                ?? obj = new Object();
                obj.f776a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.H.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i14);
                i14++;
                arrayList2.add(ah.i1.d(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.f25324c0 = true;
                ?? obj2 = new Object();
                obj2.f776a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.f19217id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.E0 = true;
                } else {
                    this.E0 = false;
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
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(this.J).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && next.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(ah.i1.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ah.i1.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.E0 = true;
            h(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i16))) {
                i16--;
                arrayList2.remove(i16);
            } else {
                hashSet.add((ah.i1) arrayList2.get(i16));
            }
            i16++;
        }
        if (!this.I && ((!this.E0 && arrayList2.size() > 16) || (this.E0 && !UserConfig.getInstance(this.J).isPremium() && MessagesController.getInstance(this.J).premiumFeaturesBlocked()))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.F0 = z13;
        if (i13 == 3 && !UserConfig.getInstance(this.J).isPremium()) {
            this.F0 = false;
        }
        if (i13 == 4) {
            this.F0 = true;
        }
        ArrayList arrayList5 = this.T;
        arrayList5.clear();
        if (q()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            int i17 = 0;
            if (dp < 1) {
                dp = 1;
            }
            while (i17 < Math.min(arrayList2.size(), dp)) {
                arrayList5.add((ah.i1) arrayList2.get(i17));
                i17++;
            }
            if (i17 < arrayList2.size()) {
                el0.a(this.f25361z0, (ah.i1) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((ah.i1) arrayList5.get(i18)).f780g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        wk0 wk0Var = this.f25318a0;
        gl0 gl0Var = wk0Var.d;
        ArrayList arrayList7 = gl0Var.e;
        ArrayList arrayList8 = gl0Var.T;
        ArrayList arrayList9 = gl0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            ah.i1 i1Var = (ah.i1) arrayList8.get(i19);
            if (i1Var.f779f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new xk0(i11, i1Var));
        }
        if (!gl0Var.U.isEmpty() && !MessagesController.getInstance(gl0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new xk0(1, null));
        }
        if (gl0Var.q()) {
            arrayList9.add(new xk0(2, null));
        }
        if (z10) {
            wk0Var.E(arrayList7, arrayList9);
        } else {
            wk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f25326d0.add(ah.i1.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
                }
            }
        }
    }

    public final boolean q() {
        if (!this.E0 && !this.F0) {
            return false;
        }
        return true;
    }

    public final void r(boolean z10) {
        ObjectAnimator duration;
        this.K0 = z10;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.L0.lock();
        boolean deviceIsHigh = SharedConfig.deviceIsHigh();
        org.telegram.ui.Cells.d1 d1Var = f25316k1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, d1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, d1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new di.t5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                bi.o0 o0Var = this.f25320b;
                if (i10 >= o0Var.getChildCount()) {
                    break;
                }
                if (o0Var.getChildAt(i10) instanceof el0) {
                    ((el0) o0Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(fp fpVar) {
        this.f25327d1 = fpVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f25356w0 = f7;
        fp fpVar = this.f25327d1;
        if (fpVar != null) {
            fpVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            this.f25354v0.setBackground(org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(28.0f), 0, i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 40)));
        } else {
            this.f25354v0.setBackground(null);
        }
    }

    public void setDelegate(fl0 fl0Var) {
        this.f25333g0 = fl0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        this.f25352t0 = m2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.c6 c6Var = this.f25341k0;
            da0 da0Var = new da0(context, c6Var);
            this.R0 = da0Var;
            da0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                this.R0.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var));
            } else {
                this.R0.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.a6.a(-2.0f, 0.0f, 6.0f, 0.0f, 0.0f, -1, 0));
        }
        this.R0.setText(charSequence);
        this.f25329e1 = false;
        ((FrameLayout.LayoutParams) this.f25361z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f25320b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMiniBubblesOffset(float f7) {
        this.V0 = f7;
    }

    public void setMirrorX(boolean z10) {
        this.M = z10;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.P0 = runnable;
    }

    public void setParentLayout(fp fpVar) {
        this.J0 = fpVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ah.i1 b10 = ah.i1.b(str);
            hashSet.add(b10);
            this.f25328e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f25320b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        this.f25318a0.l();
    }

    public void setSelectedReactionAnimated(ah.i1 i1Var) {
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f25320b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSelectedReactionInclusive(ah.i1 i1Var) {
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f25320b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = arrayList.get(i10);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i11 = 0; i11 < messageObject.messageOwner.reactions.results.size(); i11++) {
                    if (messageObject.messageOwner.reactions.results.get(i11).chosen) {
                        hashSet.add(ah.i1.d(messageObject.messageOwner.reactions.results.get(i11).reaction));
                    }
                }
            }
        }
        this.f25318a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f25320b, (Utilities.Callback<View>) new sk0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f25325c1 != z10) {
            this.f25325c1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    bi.o0 o0Var = this.f25320b;
                    if (i10 >= o0Var.getChildCount()) {
                        break;
                    }
                    if (o0Var.getChildAt(i10) instanceof el0) {
                        el0 el0Var = (el0) o0Var.getChildAt(i10);
                        boolean z11 = el0Var.f24735r;
                        dl0 dl0Var = el0Var.f24731b;
                        if (z11 && (dl0Var.getImageReceiver().getLottieAnimation() != null || dl0Var.getImageReceiver().getAnimation() != null)) {
                            dl0Var.setVisibility(0);
                            el0Var.f24730a.setVisibility(4);
                            if (el0Var.f24736s) {
                                el0Var.v = true;
                            }
                        }
                        el0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f25326d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ah.i1.d(reaction));
        }
        this.f25318a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        fp fpVar = this.J0;
        if (fpVar != null) {
            fpVar.setReactionsTransitionProgress((this.K0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    public void m() {
    }
}

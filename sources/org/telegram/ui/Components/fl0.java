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
import org.telegram.messenger.FileLog;
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
public class fl0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public static final org.telegram.ui.Cells.c1 l1 = new org.telegram.ui.Cells.c1(Float.class, "transitionProgress", 2);
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
    public ap J0;
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
    public w90 R0;
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
    public boolean f26346a;
    public final vk0 f26347a0;
    public eh.e f26348a1;
    public final ai.u1 f26349b;
    public final RectF f26350b0;
    public int f26351b1;
    public final float f26352c;
    public boolean f26353c0;
    public boolean f26354c1;
    public final ArrayList d;
    public final HashSet f26355d0;
    public boolean f26356d1;
    public final ArrayList e;
    public final HashSet f26357e0;
    public ap f26358e1;
    public final Paint f26359f;
    public final int[] f26360f0;
    public boolean f26361f1;
    public el0 f26362g0;
    public boolean f26363g1;
    public final Paint h;
    public final Rect f26364h0;
    public boolean f26365h1;
    public final Drawable f26366i0;
    public Paint f26367i1;
    public final boolean f26368j0;
    public Matrix f26369j1;
    public final org.telegram.ui.ActionBar.g6 f26370k0;
    public LinearGradient f26371k1;
    public ah.i1 f26372l0;
    public int m0;
    public final Paint f26373n;
    public float f26374n0;
    public float f26375o0;
    public float f26376p0;
    public float f26377q0;
    public float f26378r;
    public boolean f26379r0;
    public float f26380s;
    public long f26381s0;
    public org.telegram.ui.ActionBar.o2 f26382t0;
    public sg.c1 f26383u0;
    public float v;
    public bs f26384v0;
    public final RectF f26385w;
    public float f26386w0;
    public final Path f26387x;
    public ah.t0 f26388x0;
    public float f26389y;
    public ValueAnimator f26390y0;
    public final dl0 f26391z0;

    public fl0(int i10, int i11, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f26346a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        boolean z10 = true;
        Paint paint = new Paint(1);
        this.f26359f = paint;
        this.h = new Paint(1);
        this.f26373n = new Paint(1);
        this.v = 1.0f;
        this.f26385w = new RectF();
        this.f26387x = new Path();
        this.f26389y = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.E = dp;
        this.F = dp / 2.0f;
        this.G = AndroidUtilities.dp(36.0f);
        this.T = new ArrayList(20);
        this.U = new ArrayList(10);
        this.V = new ArrayList(20);
        this.f26350b0 = new RectF();
        this.f26353c0 = false;
        this.f26355d0 = new HashSet();
        this.f26357e0 = new HashSet();
        this.f26360f0 = new int[2];
        Rect rect = new Rect();
        this.f26364h0 = rect;
        new ArrayList();
        this.C0 = new HashSet();
        this.D0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.H0 = paint2;
        Paint paint3 = new Paint(1);
        this.I0 = paint3;
        this.L0 = new AnimationNotificationsLocker();
        this.O0 = true;
        this.f26363g1 = false;
        this.M0 = i10;
        this.f26352c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var));
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jj, g6Var));
        this.f26370k0 = g6Var;
        this.J = i11;
        this.f26382t0 = o2Var;
        dl0 dl0Var = new dl0(this, context);
        this.f26391z0 = dl0Var;
        dl0Var.setVisibility(8);
        dl0Var.O = false;
        dl0Var.f25781c.setVisibility(8);
        addView(dl0Var);
        this.f26368j0 = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : z10;
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f26366i0 = mutate;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.Td, null, PorterDuff.Mode.MULTIPLY);
        ai.u1 u1Var = new ai.u1(this, context, 19);
        this.f26349b = u1Var;
        u1Var.setClipChildren(false);
        u1Var.setClipToPadding(false);
        hg.i0 i0Var = new hg.i0((ViewGroup) this, 4);
        this.W = i0Var;
        u1Var.i(new sk0(this, 0));
        u1Var.setLayoutManager(i0Var);
        u1Var.setOverScrollMode(2);
        vk0 vk0Var = new vk0(this);
        this.f26347a0 = vk0Var;
        u1Var.setAdapter(vk0Var);
        u1Var.j(new zk0(this));
        u1Var.j(new iv(this, 6));
        u1Var.i(new sk0(this, 1));
        u1Var.setOnItemClickListener(new j(this, 11));
        u1Var.setOnItemLongClickListener((bm0) new i2.r(this, i10, 9));
        addView(u1Var, w7.z5.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        k();
        int paddingTop = (u1Var.getLayoutParams().height - u1Var.getPaddingTop()) - u1Var.getPaddingBottom();
        dl0Var.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        dl0Var.getLayoutParams().height = paddingTop;
        if (i10 != 2 && i10 != 4) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g6Var));
        } else {
            paint.setColor(i0.a.f(0.13f, -16777216, -1));
        }
        MediaDataController.getInstance(i11).preloadDefaultReactions();
    }

    public static void a(fl0 fl0Var) {
        if (fl0Var.f26388x0 != null) {
            return;
        }
        ah.t0 t0Var = new ah.t0(fl0Var.M0, fl0Var.f26382t0, fl0Var.V, fl0Var.f26355d0, fl0Var, fl0Var.f26370k0, fl0Var.f26346a);
        fl0Var.f26388x0 = t0Var;
        bh.b bVar = fl0Var.Z0;
        boolean z10 = true;
        if (bVar != null) {
            eh.e eVar = fl0Var.f26348a1;
            org.telegram.ui.r41 r41Var = t0Var.f878m.f35618f0;
            r41Var.f40343x = true;
            r41Var.setBackground(null);
            r41Var.updateColors();
            r41Var.invalidate();
            dh.d c10 = bVar.c(t0Var.f869a, null, true);
            c10.o(eVar);
            c10.q(AndroidUtilities.dp(12.0f));
            c10.p(AndroidUtilities.dp(8.0f));
            t0Var.f890z = c10;
        }
        ah.t0 t0Var2 = fl0Var.f26388x0;
        el0 el0Var = fl0Var.f26362g0;
        if (el0Var != null && !el0Var.i()) {
            z10 = false;
        }
        t0Var2.f878m.setLongPressEnabled(z10);
        fl0Var.j();
        fl0Var.f26388x0.f881p = new wb0(fl0Var, 17);
        fl0Var.m();
    }

    public static void b(fl0 fl0Var, View view, float f7) {
        if (view instanceof dl0) {
            ((dl0) view).h = f7;
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21255h5));
    }

    public final void d() {
        ah.t0 t0Var = this.f26388x0;
        if (t0Var != null) {
            if (!t0Var.f882q) {
                t0Var.f882q = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.j0(t0Var, 0));
                ofFloat.addListener(new ah.r0(t0Var, 0));
                ofFloat.setDuration(150L);
                ofFloat.start();
            }
            this.f26388x0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20345id == this.K && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                p(this.H, null, true);
                setVisibility(0);
                r(false);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            if (this.M0 == 4) {
                invalidate();
                ai.u1 u1Var = this.f26349b;
                u1Var.invalidate();
                u1Var.g1();
                for (int i12 = 0; i12 < u1Var.getChildCount(); i12++) {
                    View childAt = u1Var.getChildAt(i12);
                    if (childAt instanceof dl0) {
                        dl0 dl0Var = (dl0) childAt;
                        dl0Var.f25779a.invalidate();
                        dl0Var.f25780b.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fl0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        ah.t0 t0Var = this.f26388x0;
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
        RectF rectF = this.f26385w;
        if (z10) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), zr.f33337f.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f14 = rectF.bottom;
            zr zrVar = zr.f33337f;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f14, 0.0f, zrVar.getInterpolation(this.O)) - ((int) Math.ceil((1.0f - this.v) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - g(), zrVar.getInterpolation(this.O)));
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
        Drawable drawable = this.f26366i0;
        drawable.setAlpha(i10);
        Paint paint = this.f26359f;
        paint.setAlpha(i10);
        float f16 = f15 - f7;
        float f17 = dp;
        float f18 = f17 * f10;
        float f19 = height - f7;
        float f20 = f15 + f7;
        float f21 = height + f7;
        drawable.setBounds((int) (f16 - f18), (int) (f19 - f18), (int) (f20 + f18), (int) (f18 + f21));
        drawable.draw(canvas);
        boolean w9 = this.f26362g0.w();
        float f22 = height;
        RectF rectF2 = this.f26350b0;
        if (w9) {
            rectF2.set(f16, f19, f20, f21);
            f12 = f7;
            this.f26362g0.s(canvas, rectF2, f12, getX(), getY(), i10, false);
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
        float lerp = AndroidUtilities.lerp(height2, (f25 + f17) - g(), zr.f33337f.getInterpolation(this.O));
        float f26 = (-AndroidUtilities.dp(1.0f)) * f10;
        drawable.setBounds((int) ((f24 - f12) - f26), (int) ((lerp - f12) - f26), (int) (f24 + f12 + f26), (int) (f12 + lerp + f26));
        drawable.draw(canvas);
        if (this.f26362g0.w()) {
            rectF2.set(f24 - f11, lerp - f11, f24 + f11, lerp + f11);
            this.f26362g0.s(canvas, rectF2, f11, getX(), getY(), i10, false);
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

    public el0 getDelegate() {
        return this.f26362g0;
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
        return this.f26388x0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document f7;
        HashSet hashSet = this.f26355d0;
        if (hashSet.isEmpty()) {
            return "";
        }
        ah.i1 i1Var = (ah.i1) hashSet.iterator().next();
        long j10 = i1Var.f785g;
        String str = null;
        if (j10 != 0 && (f7 = p5.f(this.J, j10)) != null) {
            str = MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = i1Var.f784f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<ah.i1> getSelectedReactions() {
        return this.f26355d0;
    }

    public float getTopOffset() {
        if (this.Q0) {
            return ((FrameLayout.LayoutParams) this.f26349b.getLayoutParams()).topMargin;
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
        ah.t0 t0Var = this.f26388x0;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f871c;
    }

    public final void h(ArrayList arrayList) {
        ArrayList<TLRPC.Reaction> topReactions;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        int i11 = this.M0;
        if (i11 == 4) {
            Iterator it = this.f26355d0.iterator();
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
                    if (!hashSet.contains(d11) && (i11 == 3 || UserConfig.getInstance(this.J).isPremium() || d11.f785g == 0)) {
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
            ai.u1 u1Var = this.f26349b;
            if (i10 < u1Var.getChildCount()) {
                View childAt = u1Var.getChildAt(i10);
                if (childAt instanceof dl0) {
                    ((dl0) childAt).f25780b.invalidate();
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
        this.f26351b1 = x02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, dp, height, x02, 0, tileMode));
        this.f26373n.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, x02, 0, tileMode));
        invalidate();
    }

    public final void l(View view, ah.i1 i1Var, boolean z10) {
        el0 el0Var = this.f26362g0;
        if (el0Var != null) {
            el0Var.m(view, i1Var, z10, true);
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
        this.f26374n0 = 0.0f;
        this.B0 = 0.0f;
        this.f26372l0 = null;
        this.f26379r0 = false;
        rk0 rk0Var = new rk0(this, 1);
        ai.u1 u1Var = this.f26349b;
        AndroidUtilities.forEachViews((RecyclerView) u1Var, (Utilities.Callback<View>) rk0Var);
        this.C0.clear();
        u1Var.invalidate();
        ah.v vVar = this.S;
        if (vVar != null) {
            vVar.invalidate();
        }
        invalidate();
    }

    public final void o(bh.b bVar, eh.e eVar) {
        this.Z0 = bVar;
        this.f26348a1 = eVar;
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
        this.f26353c0 = false;
        if (i13 == 3) {
            this.E0 = UserConfig.getInstance(this.J).isPremium();
            h(arrayList2);
        } else if (i13 == 5) {
            this.E0 = true;
            h(arrayList2);
        } else if (this.I) {
            this.E0 = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.f26353c0 = true;
                ?? obj = new Object();
                obj.f781a = true;
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
                this.f26353c0 = true;
                ?? obj2 = new Object();
                obj2.f781a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.J).getChat(Long.valueOf(chatFull.f20345id));
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
                dl0.a(this.f26391z0, (ah.i1) arrayList2.get(i17), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.G0 = true;
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (((ah.i1) arrayList5.get(i18)).f785g != 0) {
                this.G0 = false;
            }
        }
        ArrayList arrayList6 = this.V;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        vk0 vk0Var = this.f26347a0;
        fl0 fl0Var = vk0Var.d;
        ArrayList arrayList7 = fl0Var.e;
        ArrayList arrayList8 = fl0Var.T;
        ArrayList arrayList9 = fl0Var.d;
        arrayList7.clear();
        arrayList7.addAll(arrayList9);
        arrayList9.clear();
        for (int i19 = 0; i19 < arrayList8.size(); i19++) {
            ah.i1 i1Var = (ah.i1) arrayList8.get(i19);
            if (i1Var.f784f == null) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            arrayList9.add(new wk0(i11, i1Var));
        }
        if (!fl0Var.U.isEmpty() && !MessagesController.getInstance(fl0Var.J).premiumFeaturesBlocked()) {
            arrayList9.add(new wk0(1, null));
        }
        if (fl0Var.q()) {
            arrayList9.add(new wk0(2, null));
        }
        if (z10) {
            vk0Var.E(arrayList7, arrayList9);
        } else {
            vk0Var.l();
        }
        if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
            for (int i20 = 0; i20 < messageObject.messageOwner.reactions.results.size(); i20++) {
                if (messageObject.messageOwner.reactions.results.get(i20).chosen) {
                    this.f26355d0.add(ah.i1.d(messageObject.messageOwner.reactions.results.get(i20).reaction));
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
        org.telegram.ui.Cells.c1 c1Var = l1;
        if (deviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, c1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new ei.k5(this, 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f7) {
        if (getAlpha() != f7 && f7 == 0.0f) {
            this.C0.clear();
            int i10 = 0;
            while (true) {
                ai.u1 u1Var = this.f26349b;
                if (i10 >= u1Var.getChildCount()) {
                    break;
                }
                if (u1Var.getChildAt(i10) instanceof dl0) {
                    ((dl0) u1Var.getChildAt(i10)).d();
                }
                i10++;
            }
        }
        super.setAlpha(f7);
    }

    public void setBubbleOffset(float f7) {
        this.U0 = f7;
    }

    public void setChatScrimView(ap apVar) {
        this.f26358e1 = apVar;
    }

    public void setCurrentAccount(int i10) {
        this.J = i10;
    }

    public void setCustomEmojiEnterProgress(float f7) {
        this.f26386w0 = f7;
        ap apVar = this.f26358e1;
        if (apVar != null) {
            apVar.setPopupAlpha(1.0f - f7);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z10) {
        if (z10) {
            bs bsVar = this.f26384v0;
            int dp = AndroidUtilities.dp(28.0f);
            int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.ActionBar.r6.S(bsVar, org.telegram.ui.ActionBar.k6.i0(dp, 0, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 40)), null, org.telegram.ui.ActionBar.r6.h(i10, 40), null);
            return;
        }
        this.f26384v0.setBackground(null);
    }

    public void setDelegate(el0 el0Var) {
        this.f26362g0 = el0Var;
    }

    public void setFlippedVertically(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        this.f26382t0 = o2Var;
    }

    public void setHint(CharSequence charSequence) {
        this.Q0 = true;
        if (this.R0 == null) {
            Context context = getContext();
            org.telegram.ui.ActionBar.g6 g6Var = this.f26370k0;
            w90 w90Var = new w90(context, g6Var);
            this.R0 = w90Var;
            w90Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.R0.setClickable(true);
            this.R0.setTextSize(1, 12.0f);
            int i10 = this.M0;
            if (i10 != 1 && i10 != 2 && i10 != 4) {
                org.telegram.ui.ActionBar.r6.W(this.R0, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
            } else {
                org.telegram.ui.ActionBar.r6.W(this.R0, org.telegram.ui.ActionBar.k6.G6, g6Var);
                this.R0.setAlpha(0.5f);
            }
            this.R0.setGravity(1);
            addView(this.R0, w7.z5.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.R0.setText(charSequence);
        this.f26361f1 = false;
        ((FrameLayout.LayoutParams) this.f26391z0.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.f26349b.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
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

    public void setParentLayout(ap apVar) {
        this.J0 = apVar;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            ah.i1 b10 = ah.i1.b(str);
            hashSet.add(b10);
            this.f26357e0.add(b10);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26349b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        this.f26347a0.l();
    }

    public void setSelectedReactionAnimated(ah.i1 i1Var) {
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26349b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReactionInclusive(ah.i1 i1Var) {
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        if (i1Var != null) {
            hashSet.add(i1Var);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.f26349b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.f26355d0;
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
        this.f26347a0.l();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        hashSet.addAll(i(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.f26349b, (Utilities.Callback<View>) new rk0(this, 0));
    }

    public void setSkipDraw(boolean z10) {
        if (this.f26356d1 != z10) {
            this.f26356d1 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    ai.u1 u1Var = this.f26349b;
                    if (i10 >= u1Var.getChildCount()) {
                        break;
                    }
                    if (u1Var.getChildAt(i10) instanceof dl0) {
                        dl0 dl0Var = (dl0) u1Var.getChildAt(i10);
                        boolean z11 = dl0Var.f25784r;
                        cl0 cl0Var = dl0Var.f25780b;
                        if (z11 && (cl0Var.getImageReceiver().getLottieAnimation() != null || cl0Var.getImageReceiver().getAnimation() != null)) {
                            cl0Var.setVisibility(0);
                            dl0Var.f25779a.setVisibility(4);
                            if (dl0Var.f25785s) {
                                dl0Var.v = true;
                            }
                        }
                        dl0Var.invalidate();
                    }
                    i10++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.f26355d0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ah.i1.d(reaction));
        }
        this.f26347a0.l();
    }

    public void setTop(boolean z10) {
        this.L = z10;
    }

    public void setTransitionProgress(float f7) {
        this.v = f7;
        ap apVar = this.J0;
        if (apVar != null) {
            apVar.setReactionsTransitionProgress((this.K0 && SharedConfig.deviceIsHigh()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 != getTranslationX()) {
            super.setTranslationX(f7);
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        Paint paint = this.f26359f;
        if (paint != null) {
            try {
                int i10 = this.M0;
                if (i10 != 2 && i10 != 4 && paint.getColor() != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f26370k0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(w02);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        sg.c1 c1Var = this.f26383u0;
        if (c1Var != null) {
            c1Var.setColor(i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.F8, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.f26351b1 != org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false)) {
            k();
        }
    }

    public void m() {
    }
}

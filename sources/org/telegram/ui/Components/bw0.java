package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class bw0 extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final int f33395r2 = 0;
    public i9 A1;
    public TextView B1;
    public j C1;
    public final AnimatorSet[] D1;
    public final View[] E1;
    public bi.g2 F1;
    public final org.telegram.ui.ActionBar.e2 G1;
    public gi.g H1;
    public final Activity I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public TLRPC.TL_messages_stickerSet N1;
    public TLRPC.Document O1;
    public org.telegram.messenger.xy P1;
    public TLRPC.InputStickerSet Q1;
    public ArrayList R1;
    public final ArrayList S1;
    public ArrayList T1;
    public HashMap U1;
    public final String V1;
    public final yv0 W1;
    public zv0 X1;
    public org.telegram.ui.f50 Y1;
    public int Z1;
    public int f33396a2;
    public boolean f33397b2;
    public boolean f33398c2;
    public boolean d2;
    public boolean f33399e2;
    public int f33400f2;
    public final a8.b8 f33401g2;
    public final pv0 f33402h2;
    public lv0 f33403i2;
    public String f33404j2;
    public int f33405k2;
    public boolean f33406l2;
    public Pattern f33407m1;
    public String f33408m2;
    public di.c1 n1;
    public Runnable f33409n2;
    public xv0 f33410o1;
    public ArrayList f33411o2;
    public v4.y f33412p1;
    public int f33413p2;
    public TLRPC.Document f33414q1;
    public int f33415q2;
    public z70 f33416r1;
    public org.telegram.ui.ActionBar.q0 f33417s1;
    public org.telegram.ui.ActionBar.z0 f33418t1;
    public h6 f33419u1;
    public ug.q0 f33420v1;
    public FrameLayout f33421w1;
    public FrameLayout f33422x1;
    public TextView f33423y1;
    public View f33424z1;

    public bw0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f33399e2 = true;
        this.f33401g2 = new a8.b8(6);
        this.f33402h2 = new pv0(this);
        this.J0 = e6Var;
        O();
        this.I1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f28121id = tL_inputPhoto;
            tL_inputPhoto.f28070id = photo.f28075id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.f28120id = tL_inputDocument;
            tL_inputDocument.f28063id = document.f28057id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.no0 no0Var = (org.telegram.ui.no0) this;
        this.f33396a2 = ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_getAttachedStickers, new bi.l1(no0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.v7(23, no0Var, tL_messages_getAttachedStickers), 13));
        P0(context);
    }

    public static void I0(bw0 bw0Var) {
        if (bw0Var.n1.getChildCount() <= 0) {
            bw0Var.W0(bw0Var.n1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < bw0Var.n1.getChildCount(); i11++) {
            View childAt = bw0Var.n1.getChildAt(i11);
            bw0Var.n1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            bw0Var.T0(0, false);
            i7 = top;
        } else {
            bw0Var.T0(0, true);
        }
        bw0Var.T0(1, true);
        if (bw0Var.Z1 != i7) {
            bw0Var.W0(i7);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.an anVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (e2Var != null) {
            if (e2Var instanceof org.telegram.ui.an) {
                anVar = (org.telegram.ui.an) e2Var;
            } else {
                anVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.m10.f24934t0);
                File J = org.telegram.messenger.w7.J(document, null, true, true);
                if (J != null && J.exists()) {
                    org.telegram.messenger.g0.i3(new kg.o0(J, arrayList, e2Var, anVar, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(new ai.j(e2Var, tL_messages_stickerSet, document, anVar, z10, 12), 300L);
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28995l5));
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0() {
        if (this.N1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.np.s1(this.f29679a).x0(this.N1);
            this.N1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.hd.M0(2131749235, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29203w6, this.J0);
            this.f33406l2 = true;
            this.f33404j2 = str;
            return;
        }
        lv0 lv0Var = this.f33403i2;
        if (lv0Var != null) {
            org.telegram.messenger.g0.r(lv0Var);
            this.f33403i2 = null;
            this.f33404j2 = null;
            if (this.f33405k2 != 0) {
                ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.f33405k2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.hd.M0(2131749237, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29088q5, this.J0);
            return;
        }
        this.f33406l2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.hd.M0(2131749237, null));
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29070p7, this.J0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131749233, null));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29070p7, this.J0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.hd.M0(2131749232, null));
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29070p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131749234, null));
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.F6, this.J0);
            this.f33404j2 = str;
            lv0 lv0Var2 = new lv0(this, str, textView, 0);
            this.f33403i2 = lv0Var2;
            org.telegram.messenger.g0.i3(lv0Var2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.hd.M0(2131749231, null));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29070p7, this.J0);
    }

    public final void L0() {
        if (!this.M1) {
            return;
        }
        this.f33412p1.h(null);
        this.M1 = false;
        this.f33401g2.q(true);
        org.telegram.messenger.g0.d0(this.n1, new fi.e(15));
        this.f33417s1.postDelayed(new kv0(this, 0), 200L);
        this.f33419u1.c(org.telegram.messenger.hd.M0(2131751221, null), true, true);
    }

    public final void N0() {
        if (this.M1) {
            return;
        }
        this.f33412p1.h(this.n1);
        this.M1 = true;
        a8.b8 b8Var = this.f33401g2;
        char c10 = 0;
        b8Var.q(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) b8Var.d;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 6; i7++) {
                arrayList.add(valueOf);
                ((ArrayList) b8Var.f344e).add(valueOf);
                ((ArrayList) b8Var.f345f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.f22414b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new aw0(b8Var, i10, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            char c11 = c10;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[c11] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new aw0(b8Var, i10, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new aw0(b8Var, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) b8Var.f341a).add(ofFloat);
            ((ArrayList) b8Var.f342b).add(ofFloat2);
            ((ArrayList) b8Var.f343c).add(ofFloat3);
            i10++;
            f10 = f11;
            c10 = c11;
        }
        org.telegram.messenger.g0.d0(this.n1, new fi.e(16));
        this.f33417s1.postDelayed(new kv0(this, 1), 200L);
        this.f33419u1.c(org.telegram.messenger.hd.M0(2131751354, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f33422x1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new h60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        int i7;
        sv0 sv0Var = new sv0(this, context);
        this.f29682b = sv0Var;
        sv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f29682b;
        int i10 = this.f29717u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.E1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.j6.V5;
        org.telegram.ui.ActionBar.q6.h(i11, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f29682b.addView(viewArr[0], layoutParams);
        di.c1 c1Var = new di.c1(27, context, this);
        this.n1 = c1Var;
        c1Var.setTag(14);
        di.c1 c1Var2 = this.n1;
        getContext();
        gi.g gVar = new gi.g(this);
        this.H1 = gVar;
        c1Var2.setLayoutManager(gVar);
        this.H1.O = new bi.y1(this, 13);
        this.f33412p1 = new v4.y(new tv0(this));
        di.c1 c1Var3 = this.n1;
        xv0 xv0Var = new xv0(this, context);
        this.f33410o1 = xv0Var;
        c1Var3.setAdapter(xv0Var);
        this.n1.setVerticalScrollBarEnabled(false);
        this.n1.i(new fi.k(12));
        this.n1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setEnabled(true);
        org.telegram.ui.ActionBar.q6.H(this.n1, org.telegram.ui.ActionBar.j6.A5, this.J0);
        this.n1.setOnTouchListener(new hk(this, 6));
        this.n1.setOnScrollListener(new ri(this, 20));
        j jVar = new j(this, 16);
        this.C1 = jVar;
        this.n1.setOnItemClickListener(jVar);
        this.f29682b.addView(this.n1, c8.ja.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.g2 g2Var = new bi.g2(28, context, this);
        this.F1 = g2Var;
        this.f29682b.addView(g2Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.n1.setEmptyView(this.F1);
        this.F1.setOnTouchListener(new gi.a(25));
        z70 z70Var = new z70(context, null);
        this.f33416r1 = z70Var;
        z70Var.setLines(1);
        this.f33416r1.setSingleLine(true);
        org.telegram.ui.ActionBar.q6.U(this.f33416r1, org.telegram.ui.ActionBar.j6.f28957j5, this.J0);
        this.f33416r1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.q6.G(this.f33416r1, org.telegram.ui.ActionBar.j6.f28977k5, this.J0);
        this.f33416r1.setEllipsize(TextUtils.TruncateAt.END);
        this.f33416r1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.f33416r1.setGravity(16);
        this.f33416r1.setTypeface(org.telegram.messenger.g0.o());
        this.f29682b.addView(this.f33416r1, c8.ja.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, this.J0), false, this.J0);
        this.f33417s1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.f33417s1.setSubMenuOpenSide(2);
        this.f33417s1.setIcon(2131231244);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f33417s1;
        int i12 = org.telegram.ui.ActionBar.j6.Ej;
        org.telegram.ui.ActionBar.q6.Q(q0Var2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, this.J0), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i12), this.J0);
        this.f29682b.addView(this.f33417s1, c8.ja.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f33417s1.e(1, 2131232364, org.telegram.messenger.hd.M0(2131744846, null));
        this.f33417s1.e(2, 2131232204, org.telegram.messenger.hd.M0(2131751762, null));
        this.f33417s1.setOnClickListener(new iv0(this, 1));
        this.f33417s1.setDelegate(new jv0(this));
        this.f33417s1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f33417s1;
        if (this.Q1 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        q0Var3.setVisibility(i7);
        this.F1.addView(new RadialProgressView(context, null), c8.ja.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.q6.h(i11, view2, this.J0);
        this.f29682b.addView(viewArr[1], layoutParams2);
        h6 h6Var = new h6(context, false, false, false);
        this.f33419u1 = h6Var;
        int i13 = org.telegram.ui.ActionBar.j6.f28922h5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i13, this.J0);
        int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.j6.i0(w02, org.telegram.ui.ActionBar.j6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        h6Var.setBackground(i02);
        org.telegram.ui.ActionBar.q6.j(h6Var, i02, M, M2, e6Var);
        h6 h6Var2 = this.f33419u1;
        int i15 = org.telegram.ui.ActionBar.j6.f29030n5;
        this.f33400f2 = i15;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i15, this.J0);
        this.f33419u1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f33419u1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f33419u1.setTypeface(org.telegram.messenger.g0.o());
        this.f33419u1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33421w1 = frameLayout;
        frameLayout.addView(this.f33419u1, c8.ja.c(48.0f, -1));
        this.f29682b.addView(this.f33421w1, c8.ja.e(-1, -2, 83));
        ug.q0 q0Var4 = new ug.q0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.f33420v1 = q0Var4;
        q0Var4.setIcon(2131624315);
        this.f33420v1.setVisibility(4);
        this.f29682b.addView(this.f33420v1, c8.ja.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33422x1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f33422x1.setSoundEffectsEnabled(false);
        this.f29682b.addView(this.f33422x1, c8.ja.c(-1.0f, -1));
        this.f33422x1.setOnClickListener(new iv0(this, 2));
        i9 i9Var = new i9(context);
        this.A1 = i9Var;
        i9Var.setAspectFit(true);
        this.A1.setLayerNum(7);
        this.f33422x1.addView(this.A1);
        TextView textView = new TextView(context);
        this.B1 = textView;
        textView.setTextSize(1, 30.0f);
        this.B1.setGravity(85);
        this.f33422x1.addView(this.B1);
        TextView textView2 = new TextView(context);
        this.f33423y1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.f33423y1, i15, this.J0);
        org.telegram.ui.ActionBar.q6.Q(this.f33423y1, org.telegram.ui.ActionBar.j6.i0(org.telegram.ui.ActionBar.j6.w0(i13, this.J0), org.telegram.ui.ActionBar.j6.w0(i14, this.J0)), org.telegram.ui.ActionBar.q6.M(i13), org.telegram.ui.ActionBar.q6.M(i14), this.J0);
        this.f33423y1.setGravity(17);
        this.f33423y1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f33423y1.setTypeface(org.telegram.messenger.g0.o());
        this.f33422x1.addView(this.f33423y1, c8.ja.e(-1, 48, 83));
        this.f33423y1.setOnClickListener(new iv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f33424z1 = view3;
        org.telegram.ui.ActionBar.q6.h(i11, view3, this.J0);
        this.f33422x1.addView(this.f33424z1, layoutParams3);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        if (this.S1 != null) {
            org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.U1);
            org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.V1);
        }
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25600x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.f33410o1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.L1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.Q1 != null) {
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.f29679a);
            if (this.N1 == null && (str = this.Q1.short_name) != null) {
                this.N1 = b02.p0(str);
            }
            if (this.N1 == null) {
                this.N1 = b02.o0(this.Q1.f28071id);
            }
            if (this.N1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.Q1;
                ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.v7(22, this, b02));
            } else {
                if (this.f33410o1 != null) {
                    a1();
                    Z0();
                    this.f33410o1.f();
                }
                Y0();
                b02.q1(this.N1);
                J0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet != null) {
            this.f33398c2 = !tL_messages_stickerSet.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.xy xyVar) {
        int indexOf = this.T1.indexOf(xyVar);
        if (indexOf >= 0) {
            this.T1.remove(indexOf);
            this.f33410o1.s(indexOf);
            if (this.T1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i7, boolean z10) {
        Integer num;
        float f10;
        if (this.R1 == null) {
            View[] viewArr = this.E1;
            if ((z10 && viewArr[i7].getTag() != null) || (!z10 && viewArr[i7].getTag() == null)) {
                View view = viewArr[i7];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i7].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.D1;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i7] = animatorSet2;
                View view2 = viewArr[i7];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i7].setDuration(150L);
                animatorSetArr[i7].addListener(new ov0(this, i7, z10));
                animatorSetArr[i7].start();
            }
        }
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 6);
        ViewGroup viewGroup = this.f29682b;
        Drawable[] drawableArr = {this.f29715s0};
        int i7 = org.telegram.ui.ActionBar.j6.f28922h5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f29682b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        if (this.f33410o1.f41775r.R1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f33417s1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f33419u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        h6 h6Var = this.f33419u1;
        int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(h6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f33419u1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, this.f33400f2));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f33423y1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f33423y1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            h6 h6Var = this.f33419u1;
            this.f33400f2 = i7;
            org.telegram.ui.ActionBar.q6.Y(h6Var, i7, this.J0);
        }
        this.f33419u1.c(str, false, true);
        this.f33419u1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33419u1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.n1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.F1.getLayoutParams();
        if (onClickListener == null) {
            this.f33419u1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            h6 h6Var2 = this.f33419u1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.j6.w0(i10, this.J0);
            int w03 = org.telegram.ui.ActionBar.j6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.q6.Q(h6Var2, org.telegram.ui.ActionBar.j6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.q6.M(i10), org.telegram.ui.ActionBar.q6.M(i11), this.J0);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, this.f33421w1, this.J0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f33419u1.getAlpha() < 1.0f) {
                org.telegram.messenger.i20.n(this.f33419u1.animate().alpha(1.0f), er.h, 240L);
            }
        } else {
            h6 h6Var3 = this.f33419u1;
            int i12 = org.telegram.ui.ActionBar.j6.f28922h5;
            int w04 = org.telegram.ui.ActionBar.j6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.j6.f29090q7;
            org.telegram.ui.ActionBar.q6.Q(h6Var3, org.telegram.ui.ActionBar.j6.i0(w04, org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i13, this.J0))), org.telegram.ui.ActionBar.q6.M(i12), org.telegram.ui.ActionBar.q6.K(0.1f, i13), this.J0);
            this.f33421w1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f33419u1.getAlpha() < 1.0f) {
                org.telegram.messenger.i20.n(this.f33419u1.animate().alpha(1.0f), er.h, 240L);
            }
        }
        this.f29682b.requestLayout();
    }

    public final void W0(int i7) {
        this.Z1 = i7;
        if (this.R1 == null) {
            float f10 = i7;
            this.f33416r1.setTranslationY(f10);
            if (this.S1 == null) {
                this.f33417s1.setTranslationY(f10);
            }
            this.E1[0].setTranslationY(f10);
        }
        this.f29682b.invalidate();
    }

    public final void X0(boolean z10) {
        this.f33410o1.getClass();
        this.f33416r1.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28995l5, this.J0));
        this.f33422x1.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0) & (-536870913));
        this.f33417s1.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Aj, this.J0));
        this.f33417s1.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.J0), false);
        this.f33417s1.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.J0), true);
        this.f33417s1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I5, this.J0));
        this.f33417s1.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.J0));
        if (this.f33418t1 != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, this.J0);
            this.f33418t1.d(w02, w02);
            this.f33418t1.setSelectorColor(org.telegram.ui.ActionBar.j6.r1(0.1f, w02));
            if (this.f33418t1.getRightIcon() != null && w02 != this.f33413p2) {
                this.f33413p2 = w02;
                this.f33418t1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.j6.h1() && this.f33411o2 == null) {
                ArrayList V = V();
                this.f33411o2 = V;
                int size = V.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.s6) this.f33411o2.get(i7)).f29602g = null;
                }
            }
            int size2 = this.f33411o2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) this.f33411o2.get(i10);
                s6Var.e(org.telegram.ui.ActionBar.j6.w0(s6Var.f29600e, this.J0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.j6.h1() && this.f33411o2 != null) {
            this.f33411o2 = null;
        }
    }

    public final void Y0() {
        if (this.f29682b != null && !org.telegram.messenger.m10.i(this.f29679a).q()) {
            org.telegram.messenger.gj.V3(this.N1);
        }
    }

    public final void Z0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String G;
        int i7;
        int i10;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i11;
        String M0;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.f33416r1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.j6.m(this.N1.set.title, this.f33416r1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f33407m1 == null) {
                    this.f33407m1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f33407m1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.N1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new g4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f33416r1.setText(m10);
            if (Q0()) {
                int measuredWidth = this.n1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f23609q.x;
                }
                xv0 xv0Var = this.f33410o1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                xv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.f33410o1.d = 5;
            }
            this.H1.y1(this.f33410o1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.N1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.m10.i(this.f29679a).q() && this.Y1 == null) {
                if (this.N1.documents != null) {
                    for (int i17 = 0; i17 < this.N1.documents.size(); i17++) {
                        if (!org.telegram.messenger.gj.m3(this.N1.documents.get(i17))) {
                            this.f33420v1.setVisibility(0);
                            this.f33419u1.setBackground(null);
                            U0(null, null, -1);
                            this.f33420v1.b(org.telegram.messenger.hd.M0(2131743865, null), new iv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f33420v1.setVisibility(4);
            }
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.f29679a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.N1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList s02 = b02.s0(5);
                for (int i18 = 0; s02 != null && i18 < s02.size(); i18++) {
                    if (s02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set.f28078id == this.N1.set.f28078id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && b02.B0(stickerSet.f28078id, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.f50 f50Var = this.Y1;
            if (f50Var != null) {
                iv0 iv0Var = new iv0(this, 5);
                boolean z12 = f50Var.f47008a;
                if (f50Var.f47010c.O) {
                    if (z12) {
                        i14 = 2131746310;
                    } else {
                        i14 = 2131745544;
                    }
                    M0 = org.telegram.messenger.hd.M0(i14, null);
                } else {
                    if (z12) {
                        i11 = 2131746309;
                    } else {
                        i11 = 2131745543;
                    }
                    M0 = org.telegram.messenger.hd.M0(i11, null);
                }
                String str = M0;
                boolean z13 = this.Y1.f47008a;
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.j6.f29090q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.Ji;
                }
                if (!z13) {
                    i13 = org.telegram.ui.ActionBar.j6.Fi;
                } else {
                    i13 = -1;
                }
                if (!z13) {
                    i16 = org.telegram.ui.ActionBar.j6.Hi;
                }
                V0(iv0Var, str, i12, i13, i16);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.N1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!b02.X[i15]) {
                    b02.B(i15);
                    V0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.N1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.hd.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.hd.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    G2 = org.telegram.messenger.hd.G(i10, "AddManyStickersCount", new Object[0]);
                }
                V0(new iv0(this, 9), G2, org.telegram.ui.ActionBar.j6.Ji, org.telegram.ui.ActionBar.j6.Fi, org.telegram.ui.ActionBar.j6.Hi);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.N1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.M1) {
                        i7 = 2131751354;
                    } else {
                        i7 = 2131751221;
                    }
                    G = org.telegram.messenger.hd.M0(i7, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z14) {
                    V0(new iv0(this, 10), str2, org.telegram.ui.ActionBar.j6.Ji, org.telegram.ui.ActionBar.j6.Fi, org.telegram.ui.ActionBar.j6.Hi);
                } else if (this.N1.set.official) {
                    U0(new iv0(this, 11), str2, org.telegram.ui.ActionBar.j6.f29090q7);
                } else {
                    U0(new iv0(this, 12), str2, org.telegram.ui.ActionBar.j6.f29090q7);
                }
            }
            this.f33410o1.f();
            return;
        }
        ArrayList arrayList5 = this.S1;
        if (arrayList5 != null) {
            z70 z70Var = this.f33416r1;
            ArrayList arrayList6 = this.T1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            z70Var.setText(org.telegram.messenger.hd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.U1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.hd.M0(2131749229, null), org.telegram.ui.ActionBar.j6.f29088q5);
                this.f33419u1.setEnabled(false);
                return;
            }
            iv0 iv0Var2 = new iv0(this, 13);
            ArrayList arrayList7 = this.T1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            U0(iv0Var2, org.telegram.messenger.hd.a0("ImportStickers", null, 2131749242, org.telegram.messenger.hd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.j6.f29030n5);
            this.f33419u1.setEnabled(true);
            return;
        }
        U0(new iv0(this, 14), org.telegram.messenger.hd.M0(2131752041, null), org.telegram.ui.ActionBar.j6.f29030n5);
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f23609q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f23608p);
        if (this.S1 != null) {
            this.f33423y1.setText(org.telegram.messenger.hd.M0(2131749228, null));
            org.telegram.ui.ActionBar.q6.U(this.f33423y1, org.telegram.ui.ActionBar.j6.f29090q7, this.J0);
            float f10 = min;
            this.A1.setLayoutParams(c8.ja.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ja.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f33423y1.setVisibility(0);
            this.f33424z1.setVisibility(0);
        } else if (this.W1 != null && ((tL_messages_stickerSet = this.N1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f33423y1.setText(org.telegram.messenger.hd.M0(2131745589, null));
            float f11 = min;
            this.A1.setLayoutParams(c8.ja.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ja.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f33423y1.setVisibility(0);
            this.f33424z1.setVisibility(0);
        } else {
            this.f33423y1.setText(org.telegram.messenger.hd.M0(2131752041, null));
            this.A1.setLayoutParams(c8.ja.e(min, min, 17));
            this.B1.setLayoutParams(c8.ja.e(min, min, 17));
            this.f33423y1.setVisibility(8);
            this.f33424z1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            di.c1 c1Var = this.n1;
            if (c1Var != null) {
                int childCount = c1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.n1.getChildAt(i11).invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.ns.U1) {
            HashMap hashMap = this.U1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) hashMap.get(str);
                if (xyVar != null) {
                    xyVar.a(this.f29679a, (TLRPC.InputFile) objArr[1], new yf(this, str, xyVar, 27));
                }
            }
        } else if (i7 == org.telegram.messenger.ns.V1) {
            HashMap hashMap2 = this.U1;
            if (hashMap2 != null) {
                org.telegram.messenger.xy xyVar2 = (org.telegram.messenger.xy) hashMap2.remove((String) objArr[0]);
                if (xyVar2 != null) {
                    S0(xyVar2);
                }
                if (this.U1.isEmpty()) {
                    Z0();
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25600x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.Q1 != null) {
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.f29679a);
                String str2 = this.Q1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = b02.p0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = b02.o0(this.Q1.f28071id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.N1) {
                this.N1 = tL_messages_stickerSet;
                R0();
            }
            Z0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f33401g2.q(false);
        Runnable runnable = this.f33409n2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f33396a2 != 0) {
            ConnectionsManager.getInstance(this.f29679a).cancelRequest(this.f33396a2, true);
            this.f33396a2 = 0;
        }
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
        if (this.S1 != null) {
            ArrayList arrayList = this.T1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) this.T1.get(i7);
                    if (!xyVar.f27624c) {
                        org.telegram.messenger.w7.G(this.f29679a).b(xyVar.f27622a, false);
                    }
                    if (xyVar.f27625e) {
                        new File(xyVar.f27622a).delete();
                    }
                }
            }
            org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.U1);
            org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.V1);
        }
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25600x0);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f33409n2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        xb.a((FrameLayout) this.f29682b, new bi.e1(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        xb.h((FrameLayout) this.f29682b);
    }

    @Override
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0);
            if (this.f29715s0 != null && w02 != this.f33415q2) {
                this.f33415q2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f29682b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 4);
    }

    public bw0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f33399e2 = true;
        this.f33401g2 = new a8.b8(6);
        this.f33402h2 = new pv0(this);
        O();
        this.I1 = (Activity) context;
        this.S1 = arrayList;
        this.V1 = str;
        Utilities.f22416e.c(new lv0(this, arrayList, arrayList2, 1));
        P0(context);
    }

    public bw0(Context context, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, yv0 yv0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f33399e2 = true;
        this.f33401g2 = new a8.b8(6);
        this.f33402h2 = new pv0(this);
        O();
        this.W1 = yv0Var;
        this.Q1 = inputStickerSet;
        this.N1 = tL_messages_stickerSet;
        this.G1 = e2Var;
        R0();
        P0(context);
    }
}

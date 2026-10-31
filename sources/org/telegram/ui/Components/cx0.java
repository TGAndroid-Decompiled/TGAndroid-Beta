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
public class cx0 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final int f25196n2 = 0;
    public final View[] A1;
    public jg.l0 B1;
    public final org.telegram.ui.ActionBar.k2 C1;
    public oi D1;
    public final Activity E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public TLRPC.TL_messages_stickerSet J1;
    public TLRPC.Document K1;
    public org.telegram.messenger.jz L1;
    public TLRPC.InputStickerSet M1;
    public ArrayList N1;
    public final ArrayList O1;
    public ArrayList P1;
    public HashMap Q1;
    public final String R1;
    public final zw0 S1;
    public ax0 T1;
    public org.telegram.ui.f60 U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean a2;
    public int f25197b2;
    public final j2.f f25198c2;
    public final rw0 f25199d2;
    public jg f25200e2;
    public String f25201f2;
    public int f25202g2;
    public boolean f25203h2;
    public Pattern f25204i1;
    public String f25205i2;
    public ag.b1 f25206j1;
    public Runnable f25207j2;
    public yw0 f25208k1;
    public ArrayList f25209k2;
    public s4.x l1;
    public int f25210l2;
    public TLRPC.Document f25211m1;
    public int f25212m2;
    public p80 f25213n1;
    public org.telegram.ui.ActionBar.t0 f25214o1;
    public org.telegram.ui.ActionBar.b1 f25215p1;
    public f6 f25216q1;
    public kg.x0 f25217r1;
    public FrameLayout f25218s1;
    public FrameLayout f25219t1;
    public TextView f25220u1;
    public View f25221v1;
    public g9 f25222w1;
    public TextView f25223x1;
    public k f25224y1;
    public final AnimatorSet[] f25225z1;

    public cx0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.f25225z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.f25198c2 = new j2.f(6);
        this.f25199d2 = new rw0(this);
        this.I0 = p6Var;
        O();
        this.E1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f19863id = tL_inputPhoto;
            tL_inputPhoto.f19812id = photo.f19817id;
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
            tL_inputStickeredMediaDocument.f19862id = tL_inputDocument;
            tL_inputDocument.f19805id = document.f19799id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this;
        this.W1 = ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_messages_getAttachedStickers, new org.telegram.ui.mb(zp0Var, obj, tL_messages_getAttachedStickers, new t20(5, zp0Var, tL_messages_getAttachedStickers), 3));
        P0(context);
    }

    public static void I0(cx0 cx0Var) {
        if (cx0Var.f25206j1.getChildCount() <= 0) {
            cx0Var.W0(cx0Var.f25206j1.getPaddingTop());
            return;
        }
        int i10 = 0;
        View view = null;
        int i11 = -1;
        for (int i12 = 0; i12 < cx0Var.f25206j1.getChildCount(); i12++) {
            View childAt = cx0Var.f25206j1.getChildAt(i12);
            cx0Var.f25206j1.getClass();
            int R = RecyclerView.R(childAt);
            if (i11 == -1 || i11 > R) {
                view = childAt;
                i11 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            cx0Var.T0(0, false);
            i10 = top;
        } else {
            cx0Var.T0(0, true);
        }
        cx0Var.T0(1, true);
        if (cx0Var.V1 != i10) {
            cx0Var.W0(i10);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.un unVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (k2Var != null) {
            if (k2Var instanceof org.telegram.ui.un) {
                unVar = (org.telegram.ui.un) k2Var;
            } else {
                unVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.b8.G(org.telegram.messenger.d20.f15147s0);
                File K = org.telegram.messenger.b8.K(document, null, true, true);
                if (K != null && K.exists()) {
                    org.telegram.messenger.i0.h3(new ag.p1(K, arrayList, k2Var, unVar, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.i0.h3(new ag.n0(k2Var, tL_messages_stickerSet, document, unVar, z10, 10), 300L);
        }
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21075l5));
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void J0() {
        if (this.J1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.vp.r1(this.f21583a).x0(this.J1);
            this.J1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.cd.L0(2131749244, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21277w6, this.I0);
            this.f25203h2 = true;
            this.f25201f2 = str;
            return;
        }
        jg jgVar = this.f25200e2;
        if (jgVar != null) {
            org.telegram.messenger.i0.r(jgVar);
            this.f25200e2 = null;
            this.f25201f2 = null;
            if (this.f25202g2 != 0) {
                ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.f25202g2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.cd.L0(2131749246, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21169q5, this.I0);
            return;
        }
        this.f25203h2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.cd.L0(2131749246, null));
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21153p7, this.I0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.cd.L0(2131749242, null));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21153p7, this.I0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.cd.L0(2131749241, null));
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21153p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.cd.L0(2131749243, null));
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.F6, this.I0);
            this.f25201f2 = str;
            jg jgVar2 = new jg(this, str, textView, 28);
            this.f25200e2 = jgVar2;
            org.telegram.messenger.i0.h3(jgVar2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.cd.L0(2131749240, null));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21153p7, this.I0);
    }

    public final void L0() {
        if (!this.I1) {
            return;
        }
        this.l1.h(null);
        this.I1 = false;
        this.f25198c2.E(true);
        org.telegram.messenger.i0.d0(this.f25206j1, new ag.z0(13));
        this.f25214o1.postDelayed(new mw0(this, 0), 200L);
        this.f25216q1.c(org.telegram.messenger.cd.L0(2131751222, null), true, true);
    }

    public final void N0() {
        if (this.I1) {
            return;
        }
        this.l1.h(this.f25206j1);
        this.I1 = true;
        j2.f fVar = this.f25198c2;
        char c10 = 0;
        fVar.E(false);
        float f7 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) fVar.d;
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 6; i10++) {
                arrayList.add(valueOf);
                ((ArrayList) fVar.e).add(valueOf);
                ((ArrayList) fVar.f9350f).add(valueOf);
            }
        }
        int i11 = 0;
        for (int i12 = 6; i11 < i12; i12 = 6) {
            long nextFloat = Utilities.f14519b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new bx0(fVar, i11, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            char c11 = c10;
            float L = org.telegram.messenger.i0.L(0.5f);
            float f10 = f7;
            float[] fArr = new float[5];
            fArr[c11] = f10;
            fArr[1] = L;
            fArr[2] = f10;
            fArr[3] = -L;
            fArr[4] = f10;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new bx0(fVar, i11, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f10;
            fArr2[1] = L;
            fArr2[2] = f10 - L;
            fArr2[3] = f10;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new bx0(fVar, i11, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) fVar.f9347a).add(ofFloat);
            ((ArrayList) fVar.f9348b).add(ofFloat2);
            ((ArrayList) fVar.f9349c).add(ofFloat3);
            i11++;
            f7 = f10;
            c10 = c11;
        }
        org.telegram.messenger.i0.d0(this.f25206j1, new ag.z0(14));
        this.f25214o1.postDelayed(new mw0(this, 1), 200L);
        this.f25216q1.c(org.telegram.messenger.cd.L0(2131751355, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f25219t1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new t60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        int i10;
        uw0 uw0Var = new uw0(this, context);
        this.f21586b = uw0Var;
        uw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f21586b;
        int i11 = this.f21615t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.A1;
        viewArr[0] = view;
        int i12 = org.telegram.ui.ActionBar.t6.V5;
        org.telegram.ui.ActionBar.a7.i(i12, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f21586b.addView(viewArr[0], layoutParams);
        ag.b1 b1Var = new ag.b1(this, context, 22);
        this.f25206j1 = b1Var;
        b1Var.setTag(14);
        ag.b1 b1Var2 = this.f25206j1;
        getContext();
        oi oiVar = new oi(this);
        this.D1 = oiVar;
        b1Var2.setLayoutManager(oiVar);
        this.D1.O = new jg.h1(this, 6);
        this.l1 = new s4.x(new vw0(this));
        ag.b1 b1Var3 = this.f25206j1;
        yw0 yw0Var = new yw0(this, context);
        this.f25208k1 = yw0Var;
        b1Var3.setAdapter(yw0Var);
        this.f25206j1.setVerticalScrollBarEnabled(false);
        this.f25206j1.i(new dh.g(9));
        this.f25206j1.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.f25206j1.setClipToPadding(false);
        this.f25206j1.setEnabled(true);
        org.telegram.ui.ActionBar.a7.I(this.f25206j1, org.telegram.ui.ActionBar.t6.A5, this.I0);
        this.f25206j1.setOnTouchListener(new bk(this, 6));
        this.f25206j1.setOnScrollListener(new bu0(this, 3));
        k kVar = new k(this, 16);
        this.f25224y1 = kVar;
        this.f25206j1.setOnItemClickListener(kVar);
        this.f21586b.addView(this.f25206j1, w7.b6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        jg.l0 l0Var = new jg.l0(this, context, 26);
        this.B1 = l0Var;
        this.f21586b.addView(l0Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f25206j1.setEmptyView(this.B1);
        this.B1.setOnTouchListener(new org.telegram.ui.ActionBar.n2(23));
        p80 p80Var = new p80(context, null);
        this.f25213n1 = p80Var;
        p80Var.setLines(1);
        this.f25213n1.setSingleLine(true);
        org.telegram.ui.ActionBar.a7.V(this.f25213n1, org.telegram.ui.ActionBar.t6.f21037j5, this.I0);
        this.f25213n1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.H(this.f25213n1, org.telegram.ui.ActionBar.t6.f21057k5, this.I0);
        this.f25213n1.setEllipsize(TextUtils.TruncateAt.END);
        this.f25213n1.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(6.0f));
        this.f25213n1.setGravity(16);
        this.f25213n1.setTypeface(org.telegram.messenger.i0.o());
        this.f21586b.addView(this.f25213n1, w7.b6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, this.I0), false, this.I0);
        this.f25214o1 = t0Var;
        t0Var.setLongClickEnabled(false);
        this.f25214o1.setSubMenuOpenSide(2);
        this.f25214o1.setIcon(2131231245);
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f25214o1;
        int i13 = org.telegram.ui.ActionBar.t6.Bj;
        org.telegram.ui.ActionBar.a7.R(t0Var2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i13, this.I0), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i13), this.I0);
        this.f21586b.addView(this.f25214o1, w7.b6.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f25214o1.e(1, 2131232362, org.telegram.messenger.cd.L0(2131744864, null));
        this.f25214o1.e(2, 2131232202, org.telegram.messenger.cd.L0(2131751762, null));
        this.f25214o1.setOnClickListener(new kw0(this, 1));
        this.f25214o1.setDelegate(new lw0(this));
        this.f25214o1.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        org.telegram.ui.ActionBar.t0 t0Var3 = this.f25214o1;
        if (this.M1 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t0Var3.setVisibility(i10);
        this.B1.addView(new RadialProgressView(context, null), w7.b6.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.a7.i(i12, view2, this.I0);
        this.f21586b.addView(viewArr[1], layoutParams2);
        f6 f6Var = new f6(context, false, false, false);
        this.f25216q1 = f6Var;
        int i14 = org.telegram.ui.ActionBar.t6.f21001h5;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, this.I0);
        int i15 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(w02, org.telegram.ui.ActionBar.t6.w0(i15, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i15);
        org.telegram.ui.ActionBar.p6 p6Var = this.I0;
        f6Var.setBackground(i02);
        org.telegram.ui.ActionBar.a7.k(f6Var, i02, N, N2, p6Var);
        f6 f6Var2 = this.f25216q1;
        int i16 = org.telegram.ui.ActionBar.t6.f21114n5;
        this.f25197b2 = i16;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i16, this.I0);
        this.f25216q1.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.f25216q1.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        this.f25216q1.setTypeface(org.telegram.messenger.i0.o());
        this.f25216q1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25218s1 = frameLayout;
        frameLayout.addView(this.f25216q1, w7.b6.c(48.0f, -1));
        this.f21586b.addView(this.f25218s1, w7.b6.e(-1, -2, 83));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(24.0f), context, this.I0, false);
        this.f25217r1 = x0Var;
        x0Var.setIcon(2131624312);
        this.f25217r1.setVisibility(4);
        this.f21586b.addView(this.f25217r1, w7.b6.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25219t1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f25219t1.setSoundEffectsEnabled(false);
        this.f21586b.addView(this.f25219t1, w7.b6.c(-1.0f, -1));
        this.f25219t1.setOnClickListener(new kw0(this, 2));
        g9 g9Var = new g9(context);
        this.f25222w1 = g9Var;
        g9Var.setAspectFit(true);
        this.f25222w1.setLayerNum(7);
        this.f25219t1.addView(this.f25222w1);
        TextView textView = new TextView(context);
        this.f25223x1 = textView;
        textView.setTextSize(1, 30.0f);
        this.f25223x1.setGravity(85);
        this.f25219t1.addView(this.f25223x1);
        TextView textView2 = new TextView(context);
        this.f25220u1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.f25220u1, i16, this.I0);
        org.telegram.ui.ActionBar.a7.R(this.f25220u1, org.telegram.ui.ActionBar.t6.i0(org.telegram.ui.ActionBar.t6.w0(i14, this.I0), org.telegram.ui.ActionBar.t6.w0(i15, this.I0)), org.telegram.ui.ActionBar.a7.N(i14), org.telegram.ui.ActionBar.a7.N(i15), this.I0);
        this.f25220u1.setGravity(17);
        this.f25220u1.setPadding(org.telegram.messenger.i0.L(29.0f), 0, org.telegram.messenger.i0.L(29.0f), 0);
        this.f25220u1.setTypeface(org.telegram.messenger.i0.o());
        this.f25219t1.addView(this.f25220u1, w7.b6.e(-1, 48, 83));
        this.f25220u1.setOnClickListener(new kw0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.i0.L(48.0f);
        View view3 = new View(context);
        this.f25221v1 = view3;
        org.telegram.ui.ActionBar.a7.i(i12, view3, this.I0);
        this.f25219t1.addView(this.f25221v1, layoutParams3);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        if (this.O1 != null) {
            org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.U1);
            org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.V1);
        }
        org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.f19718x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.f25208k1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.H1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.M1 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f21583a);
            if (this.J1 == null && (str = this.M1.short_name) != null) {
                this.J1 = b02.p0(str);
            }
            if (this.J1 == null) {
                this.J1 = b02.o0(this.M1.f19813id);
            }
            if (this.J1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.M1;
                ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_messages_getStickerSet, new t20(4, this, b02));
            } else {
                if (this.f25208k1 != null) {
                    a1();
                    Z0();
                    this.f25208k1.f();
                }
                Y0();
                b02.q1(this.J1);
                J0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        if (tL_messages_stickerSet != null) {
            this.Y1 = !tL_messages_stickerSet.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.jz jzVar) {
        int indexOf = this.P1.indexOf(jzVar);
        if (indexOf >= 0) {
            this.P1.remove(indexOf);
            this.f25208k1.s(indexOf);
            if (this.P1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i10, boolean z10) {
        Integer num;
        float f7;
        if (this.N1 == null) {
            View[] viewArr = this.A1;
            if ((z10 && viewArr[i10].getTag() != null) || (!z10 && viewArr[i10].getTag() == null)) {
                View view = viewArr[i10];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i10].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.f25225z1;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i10] = animatorSet2;
                View view2 = viewArr[i10];
                Property property = View.ALPHA;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f7));
                animatorSetArr[i10].setDuration(150L);
                animatorSetArr[i10].addListener(new qw0(this, i10, z10));
                animatorSetArr[i10].start();
            }
        }
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i10) {
        V0(onClickListener, str, i10, -1, -1);
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        o6 o6Var = new o6(this, 6);
        ViewGroup viewGroup = this.f21586b;
        Drawable[] drawableArr = {this.f21612r0};
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f21586b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        if (this.f25208k1.f32816r.N1 != null) {
            org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25214o1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25216q1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        f6 f6Var = this.f25216q1;
        int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(f6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25216q1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, this.f25197b2));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25220u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f25220u1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i10, int i11, int i12) {
        if (i10 >= 0) {
            f6 f6Var = this.f25216q1;
            this.f25197b2 = i10;
            org.telegram.ui.ActionBar.a7.Z(f6Var, i10, this.I0);
        }
        this.f25216q1.c(str, false, true);
        this.f25216q1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25216q1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f25206j1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.B1.getLayoutParams();
        if (onClickListener == null) {
            this.f25216q1.setAlpha(0.0f);
        } else if (i11 >= 0 && i12 >= 0) {
            f6 f6Var2 = this.f25216q1;
            int L = org.telegram.messenger.i0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
            int w03 = org.telegram.ui.ActionBar.t6.w0(i12, this.I0);
            org.telegram.ui.ActionBar.a7.R(f6Var2, org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.a7.N(i11), org.telegram.ui.ActionBar.a7.N(i12), this.I0);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, this.f25218s1, this.I0);
            int L2 = org.telegram.messenger.i0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.i0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f25216q1.getAlpha() < 1.0f) {
                org.telegram.messenger.z20.m(this.f25216q1.animate().alpha(1.0f), gr.h, 240L);
            }
        } else {
            f6 f6Var3 = this.f25216q1;
            int i13 = org.telegram.ui.ActionBar.t6.f21001h5;
            int w04 = org.telegram.ui.ActionBar.t6.w0(i13, this.I0);
            int i14 = org.telegram.ui.ActionBar.t6.f21170q7;
            org.telegram.ui.ActionBar.a7.R(f6Var3, org.telegram.ui.ActionBar.t6.i0(w04, org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(i14, this.I0))), org.telegram.ui.ActionBar.a7.N(i13), org.telegram.ui.ActionBar.a7.L(0.1f, i14), this.I0);
            this.f25218s1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.i0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f25216q1.getAlpha() < 1.0f) {
                org.telegram.messenger.z20.m(this.f25216q1.animate().alpha(1.0f), gr.h, 240L);
            }
        }
        this.f21586b.requestLayout();
    }

    public final void W0(int i10) {
        this.V1 = i10;
        if (this.N1 == null) {
            float f7 = i10;
            this.f25213n1.setTranslationY(f7);
            if (this.O1 == null) {
                this.f25214o1.setTranslationY(f7);
            }
            this.A1[0].setTranslationY(f7);
        }
        this.f21586b.invalidate();
    }

    public final void X0(boolean z10) {
        this.f25208k1.getClass();
        this.f25213n1.setHighlightColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21075l5, this.I0));
        this.f25219t1.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0) & (-536870913));
        this.f25214o1.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.xj, this.I0));
        this.f25214o1.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.I0), false);
        this.f25214o1.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.I0), true);
        this.f25214o1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I5, this.I0));
        this.f25214o1.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.I0));
        if (this.f25215p1 != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, this.I0);
            this.f25215p1.d(w02, w02);
            this.f25215p1.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            if (this.f25215p1.getRightIcon() != null && w02 != this.f25210l2) {
                this.f25210l2 = w02;
                this.f25215p1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.t6.h1() && this.f25209k2 == null) {
                ArrayList V = V();
                this.f25209k2 = V;
                int size = V.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.c7) this.f25209k2.get(i10)).f20236g = null;
                }
            }
            int size2 = this.f25209k2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.ActionBar.c7 c7Var = (org.telegram.ui.ActionBar.c7) this.f25209k2.get(i11);
                c7Var.e(org.telegram.ui.ActionBar.t6.w0(c7Var.e, this.I0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.t6.h1() && this.f25209k2 != null) {
            this.f25209k2 = null;
        }
    }

    public final void Y0() {
        if (this.f21586b != null && !org.telegram.messenger.d20.i(this.f21583a).q()) {
            org.telegram.messenger.jj.V3(this.J1);
        }
    }

    public final void Z0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String G;
        int i10;
        int i11;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i12;
        String L0;
        int i13;
        int i14;
        int i15;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f7;
        if (this.f25213n1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        int i16 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.k6.m(this.J1.set.title, this.f25213n1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f25204i1 == null) {
                    this.f25204i1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f25204i1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.J1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new f4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.f25213n1.setText(m10);
            if (Q0()) {
                int measuredWidth = this.f25206j1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.i0.f16026q.x;
                }
                yw0 yw0Var = this.f25208k1;
                if (org.telegram.messenger.i0.Q1()) {
                    f7 = 60.0f;
                } else {
                    f7 = 45.0f;
                }
                yw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.i0.L(f7));
            } else {
                this.f25208k1.d = 5;
            }
            this.D1.y1(this.f25208k1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.J1;
            int i17 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.d20.i(this.f21583a).q() && this.U1 == null) {
                if (this.J1.documents != null) {
                    for (int i18 = 0; i18 < this.J1.documents.size(); i18++) {
                        if (!org.telegram.messenger.jj.m3(this.J1.documents.get(i18))) {
                            this.f25217r1.setVisibility(0);
                            this.f25216q1.setBackground(null);
                            U0(null, null, -1);
                            this.f25217r1.b(org.telegram.messenger.cd.L0(2131743890, null), new kw0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f25217r1.setVisibility(4);
            }
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f21583a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.J1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList s02 = b02.s0(5);
                for (int i19 = 0; s02 != null && i19 < s02.size(); i19++) {
                    if (s02.get(i19) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i19)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i19)).set.f19820id == this.J1.set.f19820id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && b02.B0(stickerSet.f19820id, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.f60 f60Var = this.U1;
            if (f60Var != null) {
                kw0 kw0Var = new kw0(this, 5);
                boolean z12 = f60Var.f37184a;
                if (f60Var.f37186c.N) {
                    if (z12) {
                        i15 = 2131746325;
                    } else {
                        i15 = 2131745561;
                    }
                    L0 = org.telegram.messenger.cd.L0(i15, null);
                } else {
                    if (z12) {
                        i12 = 2131746324;
                    } else {
                        i12 = 2131745560;
                    }
                    L0 = org.telegram.messenger.cd.L0(i12, null);
                }
                String str = L0;
                boolean z13 = this.U1.f37184a;
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.t6.f21170q7;
                } else {
                    i13 = org.telegram.ui.ActionBar.t6.Gi;
                }
                if (!z13) {
                    i14 = org.telegram.ui.ActionBar.t6.Ci;
                } else {
                    i14 = -1;
                }
                if (!z13) {
                    i17 = org.telegram.ui.ActionBar.t6.Ei;
                }
                V0(kw0Var, str, i13, i14, i17);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.J1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i16 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i16 = 0;
                }
                if (!b02.W[i16]) {
                    b02.B(i16);
                    V0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.J1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.cd.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.cd.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i11 = arrayList2.size();
                    } else {
                        i11 = 0;
                    }
                    G2 = org.telegram.messenger.cd.G(i11, "AddManyStickersCount", new Object[0]);
                }
                V0(new kw0(this, 9), G2, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.Ci, org.telegram.ui.ActionBar.t6.Ei);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.J1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.I1) {
                        i10 = 2131751355;
                    } else {
                        i10 = 2131751222;
                    }
                    G = org.telegram.messenger.cd.L0(i10, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.cd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z14) {
                    V0(new kw0(this, 10), str2, org.telegram.ui.ActionBar.t6.Gi, org.telegram.ui.ActionBar.t6.Ci, org.telegram.ui.ActionBar.t6.Ei);
                } else if (this.J1.set.official) {
                    U0(new kw0(this, 11), str2, org.telegram.ui.ActionBar.t6.f21170q7);
                } else {
                    U0(new kw0(this, 12), str2, org.telegram.ui.ActionBar.t6.f21170q7);
                }
            }
            this.f25208k1.f();
            return;
        }
        ArrayList arrayList5 = this.O1;
        if (arrayList5 != null) {
            p80 p80Var = this.f25213n1;
            ArrayList arrayList6 = this.P1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            p80Var.setText(org.telegram.messenger.cd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.Q1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.cd.L0(2131749238, null), org.telegram.ui.ActionBar.t6.f21169q5);
                this.f25216q1.setEnabled(false);
                return;
            }
            kw0 kw0Var2 = new kw0(this, 13);
            ArrayList arrayList7 = this.P1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            U0(kw0Var2, org.telegram.messenger.cd.a0("ImportStickers", null, 2131749251, org.telegram.messenger.cd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.t6.f21114n5);
            this.f25216q1.setEnabled(true);
            return;
        }
        U0(new kw0(this, 14), org.telegram.messenger.cd.L0(2131752041, null), org.telegram.ui.ActionBar.t6.f21114n5);
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.i0.f16026q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.i0.f16025p);
        if (this.O1 != null) {
            this.f25220u1.setText(org.telegram.messenger.cd.L0(2131749237, null));
            org.telegram.ui.ActionBar.a7.V(this.f25220u1, org.telegram.ui.ActionBar.t6.f21170q7, this.I0);
            float f7 = min;
            this.f25222w1.setLayoutParams(w7.b6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25223x1.setLayoutParams(w7.b6.d(min, f7, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25220u1.setVisibility(0);
            this.f25221v1.setVisibility(0);
        } else if (this.S1 != null && ((tL_messages_stickerSet = this.J1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f25220u1.setText(org.telegram.messenger.cd.L0(2131745606, null));
            float f10 = min;
            this.f25222w1.setLayoutParams(w7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25223x1.setLayoutParams(w7.b6.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f25220u1.setVisibility(0);
            this.f25221v1.setVisibility(0);
        } else {
            this.f25220u1.setText(org.telegram.messenger.cd.L0(2131752041, null));
            this.f25222w1.setLayoutParams(w7.b6.e(min, min, 17));
            this.f25223x1.setLayoutParams(w7.b6.e(min, min, 17));
            this.f25220u1.setVisibility(8);
            this.f25221v1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            ag.b1 b1Var = this.f25206j1;
            if (b1Var != null) {
                int childCount = b1Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    this.f25206j1.getChildAt(i12).invalidate();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.U1) {
            HashMap hashMap = this.Q1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) hashMap.get(str);
                if (jzVar != null) {
                    jzVar.a(this.f21583a, (TLRPC.InputFile) objArr[1], new jg(this, str, jzVar, 25));
                }
            }
        } else if (i10 == org.telegram.messenger.zs.V1) {
            HashMap hashMap2 = this.Q1;
            if (hashMap2 != null) {
                org.telegram.messenger.jz jzVar2 = (org.telegram.messenger.jz) hashMap2.remove((String) objArr[0]);
                if (jzVar2 != null) {
                    S0(jzVar2);
                }
                if (this.Q1.isEmpty()) {
                    Z0();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19718x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.M1 != null) {
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f21583a);
                String str2 = this.M1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = b02.p0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = b02.o0(this.M1.f19813id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.J1) {
                this.J1 = tL_messages_stickerSet;
                R0();
            }
            Z0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f25198c2.E(false);
        Runnable runnable = this.f25207j2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.W1 != 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.W1, true);
            this.W1 = 0;
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        if (this.O1 != null) {
            ArrayList arrayList = this.P1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.jz jzVar = (org.telegram.messenger.jz) this.P1.get(i10);
                    if (!jzVar.f16495c) {
                        org.telegram.messenger.b8.G(this.f21583a).b(jzVar.f16493a, false);
                    }
                    if (jzVar.e) {
                        new File(jzVar.f16493a).delete();
                    }
                }
            }
            org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.U1);
            org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.V1);
        }
        org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.f19718x0);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 4);
    }

    @Override
    public final void o(Runnable runnable) {
        this.f25207j2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.lt.p().E) {
            org.telegram.ui.lt.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        wb.a((FrameLayout) this.f21586b, new k7(this, 4));
    }

    @Override
    public final void onStop() {
        super.onStop();
        wb.h((FrameLayout) this.f21586b);
    }

    @Override
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0);
            if (this.f21612r0 != null && w02 != this.f25212m2) {
                this.f25212m2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f21586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 4);
    }

    public cx0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.p6) null, false);
        this.f25225z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.f25198c2 = new j2.f(6);
        this.f25199d2 = new rw0(this);
        O();
        this.E1 = (Activity) context;
        this.O1 = arrayList;
        this.R1 = str;
        Utilities.e.c(new jg(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public cx0(Context context, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, zw0 zw0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        this.f25225z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.a2 = true;
        this.f25198c2 = new j2.f(6);
        this.f25199d2 = new rw0(this);
        O();
        this.S1 = zw0Var;
        this.M1 = inputStickerSet;
        this.J1 = tL_messages_stickerSet;
        this.C1 = k2Var;
        R0();
        P0(context);
    }
}

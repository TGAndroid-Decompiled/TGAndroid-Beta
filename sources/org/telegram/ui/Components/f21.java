package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class f21 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final String[] P1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap Q1;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public final r11 E1;
    public final e21 F1;
    public final org.telegram.ui.Cells.h9 G1;
    public final org.telegram.ui.Cells.t9 H1;
    public final View I1;
    public final TextView J1;
    public org.telegram.ui.ActionBar.d2 K1;
    public org.telegram.messenger.v10 L1;
    public boolean M1;
    public final u5 N1;
    public Boolean O1;
    public Integer f33666j1;
    public final CharSequence k1;
    public final TLRPC.InputPeer f33667l1;
    public final int m1;
    public final boolean f33668n1;
    public final TL_iv.RichMessage f33669o1;
    public final org.telegram.messenger.st f33670p1;
    public final org.telegram.messenger.st f33671q1;
    public final String f33672r1;
    public String f33673s1;
    public String f33674t1;
    public final d21 f33675u1;
    public final fi.j f33676v1;
    public final q11 f33677w1;
    public final s70 f33678x1;
    public final Drawable f33679y1;
    public final Drawable f33680z1;

    public f21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i3, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        String charSequence2;
        View view;
        this.C1 = org.telegram.ui.ActionBar.k6.I.q();
        this.M1 = true;
        this.f28618u0 = 0;
        N();
        this.k1 = charSequence;
        this.f33667l1 = inputPeer;
        this.m1 = i3;
        this.f33668n1 = z10;
        this.f33669o1 = richMessage;
        this.f33672r1 = str;
        this.f33673s1 = str2;
        z11 z11Var = new z11(this, context);
        this.f28586b = z11Var;
        this.N1 = new u5(z11Var, 320L, xq.h);
        fi.j jVar = new fi.j(context, 7);
        this.f33676v1 = jVar;
        jVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        jVar.setTextSize(1, org.telegram.messenger.az.W0);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(jVar, i10, null);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.2f, i10);
        org.telegram.ui.ActionBar.r6.o(jVar, 2, L.f28359a, -1, 2, L.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        jVar.setText(org.telegram.messenger.i6.m(charSequence2, jVar.getPaint().getFontMetricsInt(), true, null, 0));
        this.f33677w1 = new FrameLayout(context);
        s70 s70Var = new s70(context, null);
        this.f33678x1 = s70Var;
        s70Var.setDisablePaddingsOffsetY(true);
        s70Var.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        s70Var.setTextSize(1, org.telegram.messenger.az.W0);
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, null);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        s70Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.r6.D(s70Var, org.telegram.ui.ActionBar.k6.ig, null);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27998jg, this.J0);
        this.B1 = w02;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.sr.i()) {
                Drawable textSelectHandleLeft = s70Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(w02, mode);
                s70Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.f33679y1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = s70Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(w02, mode);
                s70Var.setTextSelectHandleRight(textSelectHandleRight);
                this.f33680z1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.f33677w1.addView(this.f33678x1, b8.mf.c(-1.0f, -1));
        if (this.f33669o1 != null) {
            org.telegram.messenger.st stVar = new org.telegram.messenger.st(this.f28583a, context, null);
            this.f33670p1 = stVar;
            stVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
            stVar.set(this.f33669o1);
            stVar.setTranslationLoading(true);
            org.telegram.messenger.st stVar2 = new org.telegram.messenger.st(this.f28583a, context, null);
            this.f33671q1 = stVar2;
            stVar2.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        }
        r11 r11Var = new r11(this, context);
        this.E1 = r11Var;
        r11Var.setOverScrollMode(1);
        r11Var.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m, 0, org.telegram.messenger.g0.L(80.0f));
        r11Var.setClipToPadding(true);
        u4.b0 b0Var = new u4.b0();
        r11Var.setLayoutManager(b0Var);
        if (this.f33669o1 != null) {
            view = this.f33670p1;
        } else {
            view = this.f33676v1;
        }
        ?? h0Var = new u4.h0();
        h0Var.f33276e = 1;
        h0Var.f33275c = context;
        h0Var.d = view;
        this.F1 = h0Var;
        r11Var.setAdapter(h0Var);
        r11Var.setOnScrollListener(new s11(this));
        t11 t11Var = new t11(this);
        t11Var.n(180L);
        t11Var.o(new LinearInterpolator());
        r11Var.setItemAnimator(t11Var);
        this.f28586b.addView(r11Var, b8.mf.e(-1, -2, 80));
        org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9();
        this.G1 = h9Var;
        h9Var.S(r11Var);
        h9Var.f29362z0 = b0Var;
        org.telegram.ui.Cells.t9 n4 = h9Var.n(context);
        this.H1 = n4;
        org.telegram.messenger.g0.E2(n4);
        this.f28586b.addView(n4, b8.mf.e(-1, -1, 119));
        org.telegram.messenger.st stVar3 = this.f33671q1;
        if (stVar3 != null) {
            stVar3.setTextSelectionHelper(h9Var);
        }
        d21 d21Var = new d21(this, context);
        this.f33675u1 = d21Var;
        this.f28586b.addView(d21Var, b8.mf.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout, null);
        View view2 = new View(context);
        this.I1 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, b8.mf.a(-1.0f, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.J1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131752037, null));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        this.A1 = x02;
        textView.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 24.0f));
        textView.setOnClickListener(new ga0(this, 20));
        frameLayout.addView(textView, b8.mf.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.f28586b.addView(frameLayout, b8.mf.e(-1, -2, 87));
        W0();
    }

    public static boolean I0(f21 f21Var) {
        View childAt;
        r11 r11Var = f21Var.E1;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < r11Var.getChildCount(); i3++) {
            if (RecyclerView.R(r11Var.getChildAt(i3)) == 1) {
                f10 += childAt.getHeight();
            }
        }
        if (f10 < (r11Var.getHeight() - r11Var.getPaddingTop()) - r11Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void J0(String str, String str2, String str3, org.telegram.messenger.n10 n10Var) {
        if (str2 == null) {
            org.telegram.messenger.b6.d(str, new o11(str, str3, n10Var), new o11(str, str3, n10Var), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < encode.length()) {
                int min = Math.min(i3 + 5000, encode.length());
                int i10 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i10);
                if (lastIndexOf < i3) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i10);
                    if (lastIndexOf2 >= i3) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i3, min));
                i3 = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (i12 < arrayList.size()) {
                org.telegram.messenger.n10 n10Var2 = n10Var;
                new v11(str2, str3, (String) arrayList.get(i12), new ci.o0(zArr, arrayList2, i12, n10Var2, 7)).start();
                i12++;
                n10Var = n10Var2;
            }
            return;
        }
        new v11(str2, str3, encode, n10Var).start();
    }

    public static String K0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String M0() {
        return org.telegram.messenger.hp.e1().getString("translate_to_language", org.telegram.messenger.bd.E0().f21812y.getLanguage());
    }

    public static HashMap N0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j10 = org.telegram.messenger.i6.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i3 = 0; i3 < j10.size(); i3++) {
                org.telegram.messenger.g6 g6Var = (org.telegram.messenger.g6) j10.get(i3);
                if (g6Var != null && g6Var.f22669c != null) {
                    String substring = charSequence2.substring(g6Var.f22667a, g6Var.f22668b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(g6Var);
                }
            }
        }
        return hashMap;
    }

    public static String O0(String str, boolean[] zArr, boolean[] zArr2) {
        org.telegram.messenger.yc ycVar;
        String str2;
        boolean z10;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        boolean z11 = true;
        if (zArr != null) {
            String N0 = org.telegram.messenger.bd.N0("TranslateLanguage" + str3.toUpperCase());
            if (N0 != null && !N0.startsWith("LOC_ERR")) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            if (z10) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = org.telegram.messenger.bd.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            if (N02 == null || N02.startsWith("LOC_ERR")) {
                z11 = false;
            }
            zArr2[0] = z11;
            if (z11) {
                return N02;
            }
        }
        String V0 = V0(str, false);
        if (V0 == null) {
            V0 = V0(str3, false);
        }
        if (V0 != null) {
            return V0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        org.telegram.messenger.yc ycVar2 = org.telegram.messenger.bd.E0().B;
        Iterator it = org.telegram.messenger.bd.E0().N.values().iterator();
        while (true) {
            if (it.hasNext()) {
                ycVar = (org.telegram.messenger.yc) it.next();
                String str4 = ycVar.d;
                if (str4 != null && str4.equals("remote") && ((str2 = ycVar.f26563c) == null || !str2.endsWith("_raw"))) {
                    String str5 = ycVar.f26565f;
                    if (str5 != null && str5.equals(str)) {
                        break;
                    }
                }
            } else {
                ycVar = null;
                break;
            }
        }
        if (ycVar == null) {
            return null;
        }
        if (ycVar2 != null && "en".equals(ycVar2.f26565f)) {
            return ycVar.f26562b;
        }
        return ycVar.f26561a;
    }

    public static TLRPC.TL_textWithEntities P0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        org.telegram.messenger.g6 g6Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 != null && tL_textWithEntities2.text != null) {
            for (int i3 = 0; i3 < tL_textWithEntities2.entities.size(); i3++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i3);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i10 = messageEntity.offset;
                        String substring = str.substring(i10, messageEntity.length + i10);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i3, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i3, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i3 < arrayList.size() && (tL_textWithEntities.entities.get(i3) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i3).language;
                }
            }
            if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
                HashMap N0 = N0(tL_textWithEntities.text);
                HashMap N02 = N0(tL_textWithEntities2.text);
                for (int i11 = 0; i11 < tL_textWithEntities.entities.size(); i11++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i11);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i12 = messageEntity2.offset;
                        String substring2 = str2.substring(i12, messageEntity2.length + i12);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) N0.get(substring2);
                            ArrayList arrayList3 = (ArrayList) N02.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < arrayList2.size()) {
                                        org.telegram.messenger.g6 g6Var2 = (org.telegram.messenger.g6) arrayList2.get(i13);
                                        int i14 = g6Var2.f22667a;
                                        int i15 = messageEntity2.offset;
                                        if (i14 == i15 && g6Var2.f22668b == i15 + messageEntity2.length) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                if (i13 >= 0 && i13 < arrayList3.size() && (g6Var = (org.telegram.messenger.g6) arrayList3.get(i13)) != null) {
                                    int i16 = g6Var.f22668b;
                                    int i17 = g6Var.f22667a;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i18);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i19 = messageEntity3.offset;
                                                if (org.telegram.messenger.g0.B1(i17, i16, i19, messageEntity3.length + i19)) {
                                                    break;
                                                }
                                            }
                                            i18++;
                                        } else {
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                            tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                            tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                            tL_messageEntityCustomEmoji.offset = i17;
                                            tL_messageEntityCustomEmoji.length = i16 - i17;
                                            tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return tL_textWithEntities2;
        }
        return null;
    }

    public static void S0(String str) {
        org.telegram.messenger.hp.e1().edit().putString("translate_to_language", str).apply();
    }

    public static w11 T0(Activity activity, org.telegram.ui.wm wmVar, TLRPC.InputPeer inputPeer, int i3, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.bf bfVar, Runnable runnable) {
        w11 w11Var = new w11(activity, str, str2, charSequence, inputPeer, i3, z10, runnable);
        w11Var.R0(z11);
        w11Var.K1 = wmVar;
        w11Var.L1 = bfVar;
        if (wmVar.getParentActivity() != null) {
            wmVar.showDialog(w11Var);
        }
        return w11Var;
    }

    public static void U0(Context context, org.telegram.ui.ActionBar.d2 d2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.h00 h00Var, org.telegram.ui.Cells.f fVar) {
        if (context == null) {
            return;
        }
        y11 y11Var = new y11(context, str, str2, charSequence, fVar);
        y11Var.R0(false);
        y11Var.K1 = d2Var;
        y11Var.L1 = h00Var;
        if (d2Var != null) {
            if (d2Var.getParentActivity() != null) {
                d2Var.showDialog(y11Var);
                return;
            }
            return;
        }
        y11Var.show();
    }

    public static String V0(String str, boolean z10) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (Q1 == null) {
                Q1 = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i3 = 0; i3 < availableLocales.length; i3++) {
                        Q1.put(availableLocales[i3].getLanguage(), availableLocales[i3]);
                        String country = availableLocales[i3].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = Q1;
                            hashMap.put(availableLocales[i3].getLanguage() + "-" + country.toLowerCase(), availableLocales[i3]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) Q1.get(lowerCase);
                if (locale3 != null) {
                    if (z10) {
                        locale = locale3;
                    } else {
                        locale = Locale.getDefault();
                    }
                    String displayLanguage = locale3.getDisplayLanguage(locale);
                    if (lowerCase.contains("-")) {
                        if (z10) {
                            locale2 = locale3;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        String displayCountry = locale3.getDisplayCountry(locale2);
                        if (!TextUtils.isEmpty(displayCountry)) {
                            return displayLanguage + " (" + displayCountry + ")";
                        }
                        return displayLanguage;
                    }
                    return displayLanguage;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void K() {
        if (this.f33666j1 != null) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f33666j1.intValue(), true);
            this.f33666j1 = null;
        }
        super.K();
    }

    public final float L0(boolean z10) {
        u5 u5Var;
        r11 r11Var = this.E1;
        float top = r11Var.getTop();
        if (r11Var.getChildCount() >= 1) {
            top += Math.max(0, r11Var.getChildAt(r11Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - org.telegram.messenger.g0.L(78.0f));
        if (z10 && (u5Var = this.N1) != null) {
            if (!r11Var.J1 && !this.D1) {
                return u5Var.e(false, max);
            }
            u5Var.e(true, max);
        }
        return max;
    }

    public final CharSequence Q0(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.L1 != null || this.K1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(8, this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, this.f33678x1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void R0(boolean z10) {
        s70 s70Var = this.f33678x1;
        if (s70Var != null) {
            s70Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            org.telegram.messenger.g0.h2();
            return;
        }
        getWindow().clearFlags(8192);
        org.telegram.messenger.g0.h2();
    }

    public final void W0() {
        String charSequence;
        if (this.f33666j1 != null) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f33666j1.intValue(), true);
            this.f33666j1 = null;
        }
        if ("alternative".equalsIgnoreCase(org.telegram.messenger.hp.s1(this.f28583a).U6)) {
            X0();
            return;
        }
        String str = this.f33673s1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.f33669o1;
        int i3 = this.m1;
        TLRPC.InputPeer inputPeer = this.f33667l1;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f27124id.add(Integer.valueOf(i3));
            tL_messages_translateRichMessage.to_lang = org.telegram.messenger.x00.D(str);
            this.f33666j1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_translateRichMessage, new w1(this, 15)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.k1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f33668n1 && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f27123id = i3;
            tL_messages_summarizeText.to_lang = org.telegram.messenger.x00.D(str);
            this.f33666j1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(tL_messages_summarizeText, new c3.b(1), new ai.q4(17, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f27125id.add(Integer.valueOf(i3));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = org.telegram.messenger.x00.D(str);
        this.f33666j1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_translateText, new org.telegram.ui.ActionBar.h6(26, this, tL_textWithEntities)));
    }

    public final void X0() {
        String charSequence;
        CharSequence charSequence2 = this.k1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f33672r1;
        if (str != null) {
            str = str.split("_")[0];
        }
        String str2 = "no";
        if ("nb".equals(str)) {
            str = "no";
        }
        String str3 = this.f33673s1;
        if (str3 != null) {
            str3 = str3.split("_")[0];
        }
        if (!"nb".equals(str3)) {
            str2 = str3;
        }
        J0(charSequence, str, str2, new e(this, 21));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            this.f33676v1.invalidate();
            this.f33678x1.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.I5);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.H5);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            TextView textView = this.J1;
            if (textView != null) {
                if (x02 == this.A1) {
                    if (this.C1 != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.A1 = x02;
                this.C1 = org.telegram.ui.ActionBar.k6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.y5.e(x02, 24.0f));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27998jg, this.J0);
            if (w02 != this.B1) {
                this.B1 = w02;
                Drawable drawable = this.f33679y1;
                if (drawable != null) {
                    drawable.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.f33680z1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.I5);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.H5);
    }
}

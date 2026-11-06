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
public abstract class e21 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final String[] O1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap P1;
    public int A1;
    public boolean B1;
    public boolean C1;
    public final q11 D1;
    public final d21 E1;
    public final org.telegram.ui.Cells.i9 F1;
    public final org.telegram.ui.Cells.u9 G1;
    public final View H1;
    public final TextView I1;
    public org.telegram.ui.ActionBar.f2 J1;
    public org.telegram.messenger.d20 K1;
    public boolean L1;
    public final w5 M1;
    public Boolean N1;
    public Integer f33102i1;
    public final CharSequence f33103j1;
    public final TLRPC.InputPeer f33104k1;
    public final int l1;
    public final boolean f33105m1;
    public final TL_iv.RichMessage n1;
    public final org.telegram.messenger.au f33106o1;
    public final org.telegram.messenger.au f33107p1;
    public final String f33108q1;
    public String f33109r1;
    public String f33110s1;
    public final c21 f33111t1;
    public final ei.k f33112u1;
    public final p11 f33113v1;
    public final w70 f33114w1;
    public final Drawable f33115x1;
    public final Drawable f33116y1;
    public int f33117z1;

    public e21(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i7, boolean z9, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        String charSequence2;
        View view;
        this.B1 = org.telegram.ui.ActionBar.k6.I.q();
        this.L1 = true;
        this.f28645t0 = 0;
        N();
        this.f33103j1 = charSequence;
        this.f33104k1 = inputPeer;
        this.l1 = i7;
        this.f33105m1 = z9;
        this.n1 = richMessage;
        this.f33108q1 = str;
        this.f33109r1 = str2;
        y11 y11Var = new y11(this, context);
        this.f28615b = y11Var;
        this.M1 = new w5(y11Var, 320L, xq.h);
        ei.k kVar = new ei.k(context, 7);
        this.f33112u1 = kVar;
        kVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        kVar.setTextSize(1, org.telegram.messenger.iz.W0);
        int i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.V(kVar, i10, null);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.2f, i10);
        org.telegram.ui.ActionBar.r6.o(kVar, 2, L.f28323a, -1, 2, L.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        kVar.setText(org.telegram.messenger.i6.m(charSequence2, kVar.getPaint().getFontMetricsInt(), true, null, 0));
        this.f33113v1 = new FrameLayout(context);
        w70 w70Var = new w70(context, null);
        this.f33114w1 = w70Var;
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        w70Var.setTextSize(1, org.telegram.messenger.iz.W0);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, null);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, null);
        w70Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.r6.D(w70Var, org.telegram.ui.ActionBar.k6.f27948ig, null);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27967jg, this.I0);
        this.A1 = w02;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i()) {
                Drawable textSelectHandleLeft = w70Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(w02, mode);
                w70Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.f33115x1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = w70Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(w02, mode);
                w70Var.setTextSelectHandleRight(textSelectHandleRight);
                this.f33116y1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.f33113v1.addView(this.f33114w1, c8.ha.c(-1.0f, -1));
        if (this.n1 != null) {
            org.telegram.messenger.au auVar = new org.telegram.messenger.au(this.f28612a, context, null);
            this.f33106o1 = auVar;
            auVar.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
            auVar.set(this.n1);
            auVar.setTranslationLoading(true);
            org.telegram.messenger.au auVar2 = new org.telegram.messenger.au(this.f28612a, context, null);
            this.f33107p1 = auVar2;
            auVar2.setPadding(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(6.0f));
        }
        q11 q11Var = new q11(this, context);
        this.D1 = q11Var;
        q11Var.setOverScrollMode(1);
        q11Var.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22531m, 0, org.telegram.messenger.g0.L(80.0f));
        q11Var.setClipToPadding(true);
        v4.b0 b0Var = new v4.b0();
        q11Var.setLayoutManager(b0Var);
        if (this.n1 != null) {
            view = this.f33106o1;
        } else {
            view = this.f33112u1;
        }
        ?? g0Var = new v4.g0();
        g0Var.f32750e = 1;
        g0Var.f32749c = context;
        g0Var.d = view;
        this.E1 = g0Var;
        q11Var.setAdapter(g0Var);
        q11Var.setOnScrollListener(new r11(this));
        s11 s11Var = new s11(this);
        s11Var.n(180L);
        s11Var.o(new LinearInterpolator());
        q11Var.setItemAnimator(s11Var);
        this.f28615b.addView(q11Var, c8.ha.e(-1, -2, 80));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9();
        this.F1 = i9Var;
        i9Var.S(q11Var);
        i9Var.f29323z0 = b0Var;
        org.telegram.ui.Cells.u9 n10 = i9Var.n(context);
        this.G1 = n10;
        org.telegram.messenger.g0.E2(n10);
        this.f28615b.addView(n10, c8.ha.e(-1, -1, 119));
        org.telegram.messenger.au auVar3 = this.f33107p1;
        if (auVar3 != null) {
            auVar3.setTextSelectionHelper(i9Var);
        }
        c21 c21Var = new c21(this, context);
        this.f33111t1 = c21Var;
        this.f28615b.addView(c21Var, c8.ha.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, frameLayout, null);
        View view2 = new View(context);
        this.H1 = view2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, c8.ha.a(-1.0f, org.telegram.messenger.g0.f1() / org.telegram.messenger.g0.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.I1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131752037, null));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        this.f33117z1 = x02;
        textView.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 24.0f));
        textView.setOnClickListener(new la0(this, 19));
        frameLayout.addView(textView, c8.ha.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.f28615b.addView(frameLayout, c8.ha.e(-1, -2, 87));
        W0();
    }

    public static boolean I0(e21 e21Var) {
        View childAt;
        q11 q11Var = e21Var.D1;
        float f10 = 0.0f;
        for (int i7 = 0; i7 < q11Var.getChildCount(); i7++) {
            if (RecyclerView.R(q11Var.getChildAt(i7)) == 1) {
                f10 += childAt.getHeight();
            }
        }
        if (f10 < (q11Var.getHeight() - q11Var.getPaddingTop()) - q11Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void J0(String str, String str2, String str3, org.telegram.messenger.v10 v10Var) {
        if (str2 == null) {
            org.telegram.messenger.b6.d(str, new o11(str, str3, v10Var), new o11(str, str3, v10Var), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i7 = 0;
            while (i7 < encode.length()) {
                int min = Math.min(i7 + 5000, encode.length());
                int i10 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i10);
                if (lastIndexOf < i7) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i10);
                    if (lastIndexOf2 >= i7) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i7, min));
                i7 = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i12 = 0;
            while (i12 < arrayList.size()) {
                org.telegram.messenger.v10 v10Var2 = v10Var;
                new u11(str2, str3, (String) arrayList.get(i12), new bi.v0(zArr, arrayList2, i12, v10Var2, 7)).start();
                i12++;
                v10Var = v10Var2;
            }
            return;
        }
        new u11(str2, str3, encode, v10Var).start();
    }

    public static String K0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String M0() {
        return org.telegram.messenger.qp.e1().getString("translate_to_language", org.telegram.messenger.hd.E0().f22899y.getLanguage());
    }

    public static HashMap N0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j3 = org.telegram.messenger.i6.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i7 = 0; i7 < j3.size(); i7++) {
                org.telegram.messenger.g6 g6Var = (org.telegram.messenger.g6) j3.get(i7);
                if (g6Var != null && g6Var.f22599c != null) {
                    String substring = charSequence2.substring(g6Var.f22597a, g6Var.f22598b);
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
        org.telegram.messenger.ed edVar;
        String str2;
        boolean z9;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        boolean z10 = true;
        if (zArr != null) {
            String N0 = org.telegram.messenger.hd.N0("TranslateLanguage" + str3.toUpperCase());
            if (N0 != null && !N0.startsWith("LOC_ERR")) {
                z9 = true;
            } else {
                z9 = false;
            }
            zArr[0] = z9;
            if (z9) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = org.telegram.messenger.hd.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            if (N02 == null || N02.startsWith("LOC_ERR")) {
                z10 = false;
            }
            zArr2[0] = z10;
            if (z10) {
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
        org.telegram.messenger.ed edVar2 = org.telegram.messenger.hd.E0().B;
        Iterator it = org.telegram.messenger.hd.E0().N.values().iterator();
        while (true) {
            if (it.hasNext()) {
                edVar = (org.telegram.messenger.ed) it.next();
                String str4 = edVar.d;
                if (str4 != null && str4.equals("remote") && ((str2 = edVar.f22176c) == null || !str2.endsWith("_raw"))) {
                    String str5 = edVar.f22178f;
                    if (str5 != null && str5.equals(str)) {
                        break;
                    }
                }
            } else {
                edVar = null;
                break;
            }
        }
        if (edVar == null) {
            return null;
        }
        if (edVar2 != null && "en".equals(edVar2.f22178f)) {
            return edVar.f22175b;
        }
        return edVar.f22174a;
    }

    public static TLRPC.TL_textWithEntities P0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        org.telegram.messenger.g6 g6Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 != null && tL_textWithEntities2.text != null) {
            for (int i7 = 0; i7 < tL_textWithEntities2.entities.size(); i7++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i7);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i10 = messageEntity.offset;
                        String substring = str.substring(i10, messageEntity.length + i10);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i7, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i7, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i7 < arrayList.size() && (tL_textWithEntities.entities.get(i7) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i7).language;
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
                                        int i14 = g6Var2.f22597a;
                                        int i15 = messageEntity2.offset;
                                        if (i14 == i15 && g6Var2.f22598b == i15 + messageEntity2.length) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                if (i13 >= 0 && i13 < arrayList3.size() && (g6Var = (org.telegram.messenger.g6) arrayList3.get(i13)) != null) {
                                    int i16 = g6Var.f22598b;
                                    int i17 = g6Var.f22597a;
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
        org.telegram.messenger.qp.e1().edit().putString("translate_to_language", str).apply();
    }

    public static v11 T0(Activity activity, org.telegram.ui.an anVar, TLRPC.InputPeer inputPeer, int i7, boolean z9, String str, String str2, CharSequence charSequence, boolean z10, org.telegram.ui.ef efVar, Runnable runnable) {
        v11 v11Var = new v11(activity, str, str2, charSequence, inputPeer, i7, z9, runnable);
        v11Var.R0(z10);
        v11Var.J1 = anVar;
        v11Var.K1 = efVar;
        if (anVar.getParentActivity() != null) {
            anVar.showDialog(v11Var);
        }
        return v11Var;
    }

    public static void U0(Context context, org.telegram.ui.ActionBar.f2 f2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.j00 j00Var, org.telegram.ui.Cells.f fVar) {
        if (context == null) {
            return;
        }
        x11 x11Var = new x11(context, str, str2, charSequence, fVar);
        x11Var.R0(false);
        x11Var.J1 = f2Var;
        x11Var.K1 = j00Var;
        if (f2Var != null) {
            if (f2Var.getParentActivity() != null) {
                f2Var.showDialog(x11Var);
                return;
            }
            return;
        }
        x11Var.show();
    }

    public static String V0(String str, boolean z9) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (P1 == null) {
                P1 = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i7 = 0; i7 < availableLocales.length; i7++) {
                        P1.put(availableLocales[i7].getLanguage(), availableLocales[i7]);
                        String country = availableLocales[i7].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = P1;
                            hashMap.put(availableLocales[i7].getLanguage() + "-" + country.toLowerCase(), availableLocales[i7]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) P1.get(lowerCase);
                if (locale3 != null) {
                    if (z9) {
                        locale = locale3;
                    } else {
                        locale = Locale.getDefault();
                    }
                    String displayLanguage = locale3.getDisplayLanguage(locale);
                    if (lowerCase.contains("-")) {
                        if (z9) {
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
        if (this.f33102i1 != null) {
            ConnectionsManager.getInstance(this.f28612a).cancelRequest(this.f33102i1.intValue(), true);
            this.f33102i1 = null;
        }
        super.K();
    }

    public final float L0(boolean z9) {
        w5 w5Var;
        q11 q11Var = this.D1;
        float top = q11Var.getTop();
        if (q11Var.getChildCount() >= 1) {
            top += Math.max(0, q11Var.getChildAt(q11Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - org.telegram.messenger.g0.L(78.0f));
        if (z9 && (w5Var = this.M1) != null) {
            if (!q11Var.I1 && !this.C1) {
                return w5Var.e(false, max);
            }
            w5Var.e(true, max);
        }
        return max;
    }

    public final CharSequence Q0(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.K1 != null || this.J1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(8, this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return org.telegram.messenger.i6.m(spannableStringBuilder, this.f33114w1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void R0(boolean z9) {
        w70 w70Var = this.f33114w1;
        if (w70Var != null) {
            w70Var.setTextIsSelectable(!z9);
        }
        if (z9) {
            getWindow().addFlags(8192);
            org.telegram.messenger.g0.h2();
            return;
        }
        getWindow().clearFlags(8192);
        org.telegram.messenger.g0.h2();
    }

    public final void W0() {
        String charSequence;
        if (this.f33102i1 != null) {
            ConnectionsManager.getInstance(this.f28612a).cancelRequest(this.f33102i1.intValue(), true);
            this.f33102i1 = null;
        }
        if ("alternative".equalsIgnoreCase(org.telegram.messenger.qp.s1(this.f28612a).U6)) {
            X0();
            return;
        }
        String str = this.f33109r1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.n1;
        int i7 = this.l1;
        TLRPC.InputPeer inputPeer = this.f33104k1;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f27075id.add(Integer.valueOf(i7));
            tL_messages_translateRichMessage.to_lang = org.telegram.messenger.f10.D(str);
            this.f33102i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28612a).sendRequest(tL_messages_translateRichMessage, new x1(this, 15)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f33103j1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f33105m1 && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f27074id = i7;
            tL_messages_summarizeText.to_lang = org.telegram.messenger.f10.D(str);
            this.f33102i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28612a).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new bi.p5(16, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f27076id.add(Integer.valueOf(i7));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = org.telegram.messenger.f10.D(str);
        this.f33102i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f28612a).sendRequest(tL_messages_translateText, new org.telegram.ui.ld(23, this, tL_textWithEntities)));
    }

    public final void X0() {
        String charSequence;
        CharSequence charSequence2 = this.f33103j1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f33108q1;
        if (str != null) {
            str = str.split("_")[0];
        }
        String str2 = "no";
        if ("nb".equals(str)) {
            str = "no";
        }
        String str3 = this.f33109r1;
        if (str3 != null) {
            str3 = str3.split("_")[0];
        }
        if (!"nb".equals(str3)) {
            str2 = str3;
        }
        J0(charSequence, str, str2, new d(this, 21));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25001i4) {
            this.f33112u1.invalidate();
            this.f33114w1.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.I5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.H5);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
            TextView textView = this.I1;
            if (textView != null) {
                if (x02 == this.f33117z1) {
                    if (this.B1 != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.f33117z1 = x02;
                this.B1 = org.telegram.ui.ActionBar.k6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.z5.e(x02, 24.0f));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27967jg, this.I0);
            if (w02 != this.A1) {
                this.A1 = w02;
                Drawable drawable = this.f33115x1;
                if (drawable != null) {
                    drawable.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.f33116y1;
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
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001i4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.I5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.H5);
    }
}

package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class ch0 extends org.telegram.ui.ActionBar.v2 implements AdapterView.OnItemSelectedListener {
    public static final int V1 = 0;
    public String A1;
    public String B1;
    public final org.telegram.ui.ActionBar.f2 C1;
    public final int D1;
    public final bh0 E1;
    public final View F1;
    public final bh0 G1;
    public final ImageView H1;
    public final org.telegram.ui.Components.wo I1;
    public final TextView J1;
    public final LinearLayout K1;
    public int L1;
    public final org.telegram.ui.ActionBar.m2 M1;
    public final TextView N1;
    public final RadialProgressView O1;
    public final FrameLayout P1;
    public final TextView Q1;
    public String R1;
    public int S1;
    public int T1;
    public boolean U1;
    public final LinearLayout f44312i1;
    public final org.telegram.ui.Components.lb0 f44313j1;
    public final org.telegram.ui.Components.lb0 f44314k1;
    public final FrameLayout l1;
    public final View f44315m1;
    public final fi.d n1;
    public final org.telegram.ui.Components.lb0 f44316o1;
    public final org.telegram.ui.Components.mb0 f44317p1;
    public final org.telegram.ui.Components.x70 f44318q1;
    public final ArrayList f44319r1;
    public final HashMap f44320s1;
    public final HashMap f44321t1;
    public boolean f44322u1;
    public boolean f44323v1;
    public boolean f44324w1;
    public boolean f44325x1;
    public String f44326y1;
    public boolean f44327z1;

    public ch0(android.content.Context r25, org.telegram.ui.ActionBar.f2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ch0.<init>(android.content.Context, org.telegram.ui.ActionBar.f2):void");
    }

    public static void I0(ch0 ch0Var) {
        String replaceAll = (ch0Var.E1.getText().toString() + ch0Var.G1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z9 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) ch0Var.f44320s1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) ch0Var.f44321t1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z9 = true;
                            break;
                        }
                    }
                }
            }
            if (z9) {
                break;
            }
        }
        if (!z9) {
            if (!TextUtils.isEmpty(ch0Var.R1)) {
                ch0Var.R1 = null;
                ch0Var.Q0(null);
            }
        } else if (!TextUtils.equals(ch0Var.R1, replaceAll)) {
            ch0Var.R1 = replaceAll;
            ch0Var.Q0(replaceAll);
        }
    }

    public static String K0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i7 = 4; i7 >= 1; i7--) {
                    String substring = str2.substring(0, i7);
                    if (((String) hashMap.get(substring)) != null) {
                        return a8.p0.p("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28012l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.H6));
    }

    public final void J0() {
        String str;
        this.f44325x1 = true;
        org.telegram.messenger.g0.Z3(this.N1, false, 0.5f, true, true);
        org.telegram.messenger.g0.Z3(this.O1, true, 0.5f, true, true);
        String str2 = "+" + this.E1.getText().toString() + this.G1.getText().toString();
        String obj = this.f44313j1.getEditText().getText().toString();
        String obj2 = this.f44314k1.getEditText().getText().toString();
        if (this.f44316o1.getVisibility() == 0) {
            str = this.f44316o1.getEditText().getText().toString();
        } else {
            str = "";
        }
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str2;
        if (!TextUtils.isEmpty(str)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = str;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.f28621a).bindRequestToGuid(ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.D1);
        if (this.I1.f40108a.f31268q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str2 != null && !str2.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void L0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.M1.animate();
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40458f;
            animate.setInterpolator(xqVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.Q1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.E1.animate().setInterpolator(xqVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.M1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Q1.animate();
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40458f;
        animate2.setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.E1.animate().setInterpolator(xqVar2).translationX(0.0f).setDuration(150L);
        this.M1.setText(charSequence);
    }

    public final void M0(java.lang.String r12, org.telegram.ui.os r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ch0.M0(java.lang.String, org.telegram.ui.os):void");
    }

    public final void N0(String str, boolean z9) {
        String country;
        this.f44326y1 = str;
        this.f44327z1 = z9;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f10 = org.telegram.messenger.p10.i(this.f28621a).f();
            if (this.f44326y1.startsWith("+")) {
                this.E1.setText(this.f44326y1.substring(1));
            } else if (!this.f44327z1 && f10 != null && !TextUtils.isEmpty(f10.phone)) {
                String str2 = f10.phone;
                int i7 = 4;
                while (true) {
                    if (i7 >= 1) {
                        List list = (List) this.f44320s1.get(str2.substring(0, i7));
                        if (list != null && list.size() > 0) {
                            String str3 = ((os) list.get(0)).f48512c;
                            this.E1.setText(str3);
                            if (str3.endsWith("0") && this.f44326y1.startsWith("0")) {
                                this.f44326y1 = this.f44326y1.substring(1);
                            }
                        } else {
                            i7--;
                        }
                    } else {
                        Context context = org.telegram.messenger.t0.f25566b;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.E1.setText(country);
                        if (country.endsWith("0") && this.f44326y1.startsWith("0")) {
                            this.f44326y1 = this.f44326y1.substring(1);
                        }
                    }
                }
                this.G1.setText(this.f44326y1);
            } else {
                this.E1.setText(this.f44326y1);
            }
            this.f44326y1 = null;
        }
    }

    public final void O0(boolean z9) {
        float f10;
        ViewPropertyAnimator animate = this.K1.animate();
        float f11 = 0.0f;
        if (z9) {
            f10 = -org.telegram.messenger.g0.L(21.33f);
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f10);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 420L);
        ViewPropertyAnimator animate2 = this.l1.animate();
        if (z9) {
            f11 = -org.telegram.messenger.g0.L(10.665f);
        }
        animate2.translationY(f11).setInterpolator(xqVar).setDuration(420L).start();
    }

    public final void P0(boolean z9) {
        int i7;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.I1.f40108a.f31268q;
        final boolean z11 = !z10;
        float f14 = 0.0f;
        int i11 = 0;
        if (z9) {
            this.n1.setVisibility(0);
            ViewPropertyAnimator animate = this.n1.animate();
            if (!z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            alpha.setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ch0 f52557b;

                {
                    this.f52557b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            ch0 ch0Var = this.f52557b;
                            if (!z12) {
                                ch0Var.n1.setVisibility(4);
                                return;
                            } else {
                                ch0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            ch0 ch0Var2 = this.f52557b;
                            if (!z13) {
                                ch0Var2.f44315m1.setVisibility(4);
                                return;
                            } else {
                                ch0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            ch0 ch0Var3 = this.f52557b;
                            if (z14) {
                                ch0Var3.f44316o1.setVisibility(4);
                                return;
                            } else {
                                ch0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f44315m1.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f44315m1.animate();
            if (!z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animate2.alpha(f13).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ch0 f52557b;

                {
                    this.f52557b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            ch0 ch0Var = this.f52557b;
                            if (!z12) {
                                ch0Var.n1.setVisibility(4);
                                return;
                            } else {
                                ch0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            ch0 ch0Var2 = this.f52557b;
                            if (!z13) {
                                ch0Var2.f44315m1.setVisibility(4);
                                return;
                            } else {
                                ch0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            ch0 ch0Var3 = this.f52557b;
                            if (z14) {
                                ch0Var3.f44316o1.setVisibility(4);
                                return;
                            } else {
                                ch0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f44316o1.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f44316o1.animate();
            if (z10) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setInterpolator(xqVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final ch0 f52557b;

                {
                    this.f52557b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z12 = z11;
                            ch0 ch0Var = this.f52557b;
                            if (!z12) {
                                ch0Var.n1.setVisibility(4);
                                return;
                            } else {
                                ch0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z13 = z11;
                            ch0 ch0Var2 = this.f52557b;
                            if (!z13) {
                                ch0Var2.f44315m1.setVisibility(4);
                                return;
                            } else {
                                ch0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z14 = z11;
                            ch0 ch0Var3 = this.f52557b;
                            if (z14) {
                                ch0Var3.f44316o1.setVisibility(4);
                                return;
                            } else {
                                ch0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.n1.animate().cancel();
        if (!z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.n1.setVisibility(i7);
        if (!z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.n1.setAlpha(f10);
        this.f44315m1.animate().cancel();
        if (!z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f44315m1.setVisibility(i10);
        if (!z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        this.f44315m1.setAlpha(f11);
        this.f44316o1.animate().cancel();
        if (!z10) {
            i11 = 4;
        }
        this.f44316o1.setVisibility(i11);
        if (z10) {
            f14 = 1.0f;
        }
        this.f44316o1.setAlpha(f14);
    }

    public final void Q0(String str) {
        if (this.S1 >= 0) {
            ConnectionsManager.getInstance(this.f28621a).cancelRequest(this.S1, true);
            this.S1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.camera.q.l(this.H1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.xq.h, 420L);
            this.f44318q1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.camera.q.l(this.H1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.xq.h, 420L);
        this.H1.setImageDrawable(new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28029m5, this.I0)));
        this.f44318q1.setText("");
        O0(true);
        org.telegram.ui.Components.fx fxVar = new org.telegram.ui.Components.fx(16, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.g5.r(this.f28621a).f22615k0.get(pf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28621a).a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                fxVar.a(a22);
                return;
            } else {
                org.telegram.messenger.yr.a0(this.f28621a).f26719a.c(new oc0(this, tL_contact, fxVar, 8));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        this.S1 = ConnectionsManager.getInstance(this.f28621a).sendRequest(tL_contacts_resolvePhone, new j50(12, this, fxVar));
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44313j1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44314k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        int i10 = org.telegram.ui.ActionBar.l6.f27994k6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.E1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        int i11 = org.telegram.ui.ActionBar.l6.f28012l6;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.E1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.G1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.G1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.G1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i11));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.i3(new wg0(this, 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.f44324w1) {
            this.f44324w1 = false;
            return;
        }
        this.f44322u1 = true;
        this.E1.setText(((os) this.f44319r1.get(i7)).f48512c);
        this.f44322u1 = false;
    }

    @Override
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.O1;
            org.telegram.ui.ActionBar.f2 f2Var = this.C1;
            if (radialProgressView != null && f2Var != null) {
                radialProgressView.setProgressColor(f2Var.getThemedColor(org.telegram.ui.ActionBar.l6.Gi));
            }
            if (this.P1 != null && f2Var != null && ((themedColor = f2Var.getThemedColor(org.telegram.ui.ActionBar.l6.Ci)) != this.T1 || this.U1 != org.telegram.ui.ActionBar.l6.I.q())) {
                this.U1 = org.telegram.ui.ActionBar.l6.I.q();
                this.T1 = themedColor;
                org.telegram.ui.ActionBar.l6.H1(this.P1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.l6.H1(this.P1.getBackground(), org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.P1.invalidate();
            }
            ImageView imageView = this.H1;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.cp)) {
                ((org.telegram.ui.Components.cp) this.H1.getDrawable()).b(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28029m5, this.I0));
                this.H1.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f44313j1.getEditText().requestFocus();
        this.f44313j1.getEditText().setSelection(this.f44313j1.getEditText().length());
        org.telegram.messenger.g0.i3(new wg0(this, 1), 50L);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

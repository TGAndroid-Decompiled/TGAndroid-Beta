package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class qj0 extends org.telegram.ui.ActionBar.k3 implements AdapterView.OnItemSelectedListener {
    public static final int f42724e0 = 0;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public boolean I;
    public String J;
    public String K;
    public final org.telegram.ui.ActionBar.r2 L;
    public final int M;
    public final oj0 N;
    public final View O;
    public final oj0 P;
    public final ImageView Q;
    public final org.telegram.ui.Components.aq R;
    public final TextView S;
    public final LinearLayout T;
    public int U;
    public final mj0 V;
    public final TextView W;
    public final RadialProgressView X;
    public final FrameLayout Y;
    public final TextView Z;
    public String f42725a0;
    public final LinearLayout f42726b;
    public int f42727b0;
    public final org.telegram.ui.Components.qd0 f42728c;
    public int f42729c0;
    public final org.telegram.ui.Components.qd0 d;
    public boolean f42730d0;
    public final FrameLayout e;
    public final View f42731f;
    public final fi.d h;
    public final org.telegram.ui.Components.qd0 f42732n;
    public final org.telegram.ui.Components.sd0 f42733r;
    public final org.telegram.ui.Components.aa0 f42734s;
    public final ArrayList v;
    public final HashMap f42735w;
    public final HashMap f42736x;
    public boolean f42737y;

    public qj0(android.content.Context r25, org.telegram.ui.ActionBar.r2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj0.<init>(android.content.Context, org.telegram.ui.ActionBar.r2):void");
    }

    public static void m(qj0 qj0Var, TLObject tLObject, org.telegram.ui.Components.oy oyVar) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(qj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(qj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(qj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
                oyVar.run(user);
            }
        }
        user = null;
        oyVar.run(user);
    }

    public static void n(qj0 qj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.r2 r2Var = qj0Var.L;
        qj0Var.G = false;
        if (tL_contacts_importedContacts != null) {
            if (!tL_contacts_importedContacts.users.isEmpty()) {
                MessagesController.getInstance(qj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
                MessagesController.getInstance(qj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, qj0Var.L, 1, false);
                qj0Var.dismiss();
                return;
            } else if (r2Var.getParentActivity() == null) {
                return;
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(qj0Var.W, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(qj0Var.X, false, 0.5f, true);
                org.telegram.ui.Components.g5.u(r2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
                return;
            }
        }
        AndroidUtilities.updateViewVisibilityAnimated(qj0Var.W, true, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(qj0Var.X, false, 0.5f, true);
        org.telegram.ui.Components.g5.e0(qj0Var.currentAccount, tL_error, r2Var, tL_contacts_importContacts, new Object[0]);
    }

    public static void o(qj0 qj0Var, String str, TLRPC.User user) {
        if (user == null) {
            qj0Var.Q.setImageDrawable(null);
            qj0Var.f42734s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new kb0(20, qj0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            Drawable mutate = qj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
            org.telegram.ui.ActionBar.f7.y(qj0Var.Q, mutate, org.telegram.ui.ActionBar.y6.f23693v6, qj0Var.resourcesProvider, PorterDuff.Mode.SRC_IN);
            qj0Var.Q.setImageDrawable(mutate);
            if (user.contact) {
                qj0Var.f42734s.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new kb0(21, qj0Var, user)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            } else {
                qj0Var.f42734s.setText("This phone number is on Telegram.");
            }
        }
        qj0Var.x(false);
    }

    public static void r(qj0 qj0Var) {
        String replaceAll = (qj0Var.N.getText().toString() + qj0Var.P.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) qj0Var.f42735w.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) qj0Var.f42736x.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (!z10) {
            if (!TextUtils.isEmpty(qj0Var.f42725a0)) {
                qj0Var.f42725a0 = null;
                qj0Var.A(null);
            }
        } else if (!TextUtils.equals(qj0Var.f42725a0, replaceAll)) {
            qj0Var.f42725a0 = replaceAll;
            qj0Var.A(replaceAll);
        }
    }

    public static String t(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i10 = 4; i10 >= 1; i10--) {
                    String substring = str2.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        return a1.g.p("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    public final void A(String str) {
        if (this.f42727b0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f42727b0, true);
            this.f42727b0 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.wh.q(this.Q.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.ds.h, 420L);
            this.f42734s.setText("");
            x(true);
            return;
        }
        org.telegram.messenger.wh.q(this.Q.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.ds.h, 420L);
        this.Q.setImageDrawable(new org.telegram.ui.Components.gq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.y6.f23520m5)));
        this.f42734s.setText("");
        x(true);
        org.telegram.ui.Components.oy oyVar = new org.telegram.ui.Components.oy(16, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(kf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                oyVar.run(user);
                return;
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new ne0(this, tL_contact, oyVar, 9));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = kf.b.d(str, false);
        this.f42727b0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new l10(14, this, oyVar));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23503l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new ij0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42728c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        int i11 = org.telegram.ui.ActionBar.y6.f23485k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.N, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.f23503l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.N, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.P, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.F) {
            this.F = false;
            return;
        }
        this.f42737y = true;
        this.N.setText(((lt) this.v.get(i10)).f41260c);
        this.f42737y = false;
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        try {
            RadialProgressView radialProgressView = this.X;
            org.telegram.ui.ActionBar.r2 r2Var = this.L;
            if (radialProgressView != null && r2Var != null) {
                radialProgressView.setProgressColor(r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.Sh));
            }
            if (this.Y != null && r2Var != null && ((themedColor = r2Var.getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.f42729c0 || this.f42730d0 != org.telegram.ui.ActionBar.y6.I.q())) {
                this.f42730d0 = org.telegram.ui.ActionBar.y6.I.q();
                this.f42729c0 = themedColor;
                org.telegram.ui.ActionBar.y6.E1(this.Y.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.y6.E1(this.Y.getBackground(), org.telegram.ui.ActionBar.o6.b(themedColor), true);
                this.Y.invalidate();
            }
            ImageView imageView = this.Q;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.gq)) {
                ((org.telegram.ui.Components.gq) this.Q.getDrawable()).b(getThemedColor(org.telegram.ui.ActionBar.y6.f23520m5));
                this.Q.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s() {
        String str;
        this.G = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.W, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.X, true, 0.5f, true);
        String str2 = "+" + this.N.getText().toString() + this.P.getText().toString();
        String obj = this.f42728c.getEditText().getText().toString();
        String obj2 = this.d.getEditText().getText().toString();
        if (this.f42732n.getVisibility() == 0) {
            str = this.f42732n.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new ea(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.M);
        if (this.R.f26634a.f26091q) {
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
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f42728c.getEditText().requestFocus();
        this.f42728c.getEditText().setSelection(this.f42728c.getEditText().length());
        AndroidUtilities.runOnUIThread(new ij0(this, 1), 50L);
    }

    public final void u(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.V.animate();
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
            animate.setInterpolator(dsVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.Z.animate().setInterpolator(dsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.N.animate().setInterpolator(dsVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.V.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Z.animate();
        org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f27530f;
        animate2.setInterpolator(dsVar2).translationX(0.0f).setDuration(150L);
        this.N.animate().setInterpolator(dsVar2).translationX(0.0f).setDuration(150L);
        this.V.setText(charSequence);
    }

    public final void v(java.lang.String r12, org.telegram.ui.lt r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qj0.v(java.lang.String, org.telegram.ui.lt):void");
    }

    public final void w(String str, boolean z10) {
        String country;
        this.H = str;
        this.I = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            if (this.H.startsWith("+")) {
                this.N.setText(this.H.substring(1));
            } else if (!this.I && currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                String str2 = currentUser.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f42735w.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((lt) list.get(0)).f41260c;
                            this.N.setText(str3);
                            if (str3.endsWith("0") && this.H.startsWith("0")) {
                                this.H = this.H.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else {
                        Context context = ApplicationLoader.applicationContext;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.N.setText(country);
                        if (country.endsWith("0") && this.H.startsWith("0")) {
                            this.H = this.H.substring(1);
                        }
                    }
                }
                this.P.setText(this.H);
            } else {
                this.N.setText(this.H);
            }
            this.H = null;
        }
    }

    public final void x(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.T.animate();
        float f10 = 0.0f;
        if (z10) {
            f7 = -AndroidUtilities.dp(21.33f);
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f7);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        org.telegram.messenger.wh.q(translationY, dsVar, 420L);
        ViewPropertyAnimator animate2 = this.e.animate();
        if (z10) {
            f10 = -AndroidUtilities.dp(10.665f);
        }
        animate2.translationY(f10).setInterpolator(dsVar).setDuration(420L).start();
    }

    public final void y(boolean z10) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.R.f26634a.f26091q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.h.setVisibility(0);
            ViewPropertyAnimator animate = this.h.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            alpha.setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final qj0 f41194b;

                {
                    this.f41194b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            qj0 qj0Var = this.f41194b;
                            if (!z13) {
                                qj0Var.h.setVisibility(4);
                                return;
                            } else {
                                qj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            qj0 qj0Var2 = this.f41194b;
                            if (!z14) {
                                qj0Var2.f42731f.setVisibility(4);
                                return;
                            } else {
                                qj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            qj0 qj0Var3 = this.f41194b;
                            if (z15) {
                                qj0Var3.f42732n.setVisibility(4);
                                return;
                            } else {
                                qj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f42731f.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f42731f.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final qj0 f41194b;

                {
                    this.f41194b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            qj0 qj0Var = this.f41194b;
                            if (!z13) {
                                qj0Var.h.setVisibility(4);
                                return;
                            } else {
                                qj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            qj0 qj0Var2 = this.f41194b;
                            if (!z14) {
                                qj0Var2.f42731f.setVisibility(4);
                                return;
                            } else {
                                qj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            qj0 qj0Var3 = this.f41194b;
                            if (z15) {
                                qj0Var3.f42732n.setVisibility(4);
                                return;
                            } else {
                                qj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f42732n.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f42732n.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(dsVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final qj0 f41194b;

                {
                    this.f41194b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            qj0 qj0Var = this.f41194b;
                            if (!z13) {
                                qj0Var.h.setVisibility(4);
                                return;
                            } else {
                                qj0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            qj0 qj0Var2 = this.f41194b;
                            if (!z14) {
                                qj0Var2.f42731f.setVisibility(4);
                                return;
                            } else {
                                qj0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            qj0 qj0Var3 = this.f41194b;
                            if (z15) {
                                qj0Var3.f42732n.setVisibility(4);
                                return;
                            } else {
                                qj0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.h.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.h.setVisibility(i10);
        if (!z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.h.setAlpha(f7);
        this.f42731f.animate().cancel();
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f42731f.setVisibility(i11);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f42731f.setAlpha(f10);
        this.f42732n.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f42732n.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f42732n.setAlpha(f13);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class be0 extends org.telegram.ui.ActionBar.e3 {
    public static final int K = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public bj G;
    public final ArrayList H;
    public final ArrayList I;
    public final TLRPC.TL_userContact_old2 J;

    public final yd0 f27074b;

    public final td0 f27075c;
    public final LinearLayout d;

    public final ud0 f27076e;

    public final View f27077f;
    public final View h;

    public final TextView f27078n;

    public final org.telegram.ui.ActionBar.n2 f27079r;

    public boolean f27080s;
    public final Paint v;

    public int f27081w;

    public AnimatorSet f27082x;

    public AnimatorSet f27083y;

    public be0(org.telegram.ui.ActionBar.n2 n2Var, ContactsController.Contact contact, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final org.telegram.ui.ActionBar.c6 c6Var) {
        ArrayList<TLRPC.User> arrayListLoadVCardFromStream;
        String str4;
        String str5;
        super(n2Var.getParentActivity(), c6Var, false, false);
        this.v = new Paint(1);
        this.H = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        String name = ContactsController.formatName(str2, str3);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<TLRPC.RestrictionReason> arrayList3 = null;
        if (uri != null) {
            arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(uri, this.currentAccount, false, arrayList2, name);
        } else if (file != null) {
            arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.fromFile(file), this.currentAccount, false, arrayList2, name);
            file.delete();
            this.F = true;
        } else {
            if (str != null) {
                AndroidUtilities.VcardItem vcardItem = new AndroidUtilities.VcardItem();
                vcardItem.type = 0;
                ArrayList<String> arrayList4 = vcardItem.vcardData;
                String strConcat = "TEL;MOBILE:+".concat(str);
                vcardItem.fullData = strConcat;
                arrayList4.add(strConcat);
                arrayList.add(vcardItem);
                this.F = true;
            } else {
                String str6 = contact.key;
                if (str6 != null) {
                    arrayListLoadVCardFromStream = AndroidUtilities.loadVCardFromStream(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.currentAccount, true, arrayList2, name);
                } else {
                    AndroidUtilities.VcardItem vcardItem2 = new AndroidUtilities.VcardItem();
                    vcardItem2.type = 0;
                    ArrayList<String> arrayList5 = vcardItem2.vcardData;
                    String str7 = "TEL;MOBILE:+" + contact.user.phone;
                    vcardItem2.fullData = str7;
                    arrayList5.add(str7);
                    arrayList.add(vcardItem2);
                }
            }
            arrayListLoadVCardFromStream = null;
        }
        TLRPC.User user2 = (user != null || contact == null) ? user : contact.user;
        if (arrayListLoadVCardFromStream != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                AndroidUtilities.VcardItem vcardItem3 = (AndroidUtilities.VcardItem) arrayList2.get(i10);
                if (vcardItem3.type == 0) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.I.size()) {
                            this.I.add(vcardItem3);
                            break;
                        } else {
                            if (((AndroidUtilities.VcardItem) this.I.get(i11)).getValue(false).equals(vcardItem3.getValue(false))) {
                                vcardItem3.checked = false;
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    this.H.add(vcardItem3);
                }
            }
            if (arrayListLoadVCardFromStream.isEmpty()) {
                str4 = str2;
                str5 = str3;
            } else {
                TLRPC.User user3 = arrayListLoadVCardFromStream.get(0);
                arrayList3 = user3.restriction_reason;
                if (TextUtils.isEmpty(str2)) {
                    str4 = user3.first_name;
                    str5 = user3.last_name;
                } else {
                    str4 = str2;
                    str5 = str3;
                }
            }
        } else {
            str4 = str2;
            str5 = str3;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
        this.J = tL_userContact_old2;
        if (user2 != null) {
            tL_userContact_old2.f22527id = user2.f22527id;
            tL_userContact_old2.access_hash = user2.access_hash;
            tL_userContact_old2.photo = user2.photo;
            tL_userContact_old2.status = user2.status;
            tL_userContact_old2.first_name = user2.first_name;
            tL_userContact_old2.last_name = user2.last_name;
            tL_userContact_old2.phone = user2.phone;
            if (arrayList3 != null) {
                tL_userContact_old2.restriction_reason = arrayList3;
            }
        } else {
            tL_userContact_old2.first_name = str4;
            tL_userContact_old2.last_name = str5;
        }
        this.f27079r = n2Var;
        final Activity parentActivity = n2Var.getParentActivity();
        ArrayList arrayList6 = this.H;
        this.A = 1;
        ArrayList arrayList7 = this.I;
        if (arrayList7.size() > 1 || !arrayList6.isEmpty()) {
            if (arrayList7.isEmpty()) {
                this.B = -1;
                this.C = -1;
            } else {
                int i12 = this.A;
                this.B = i12;
                int size = arrayList7.size() + i12;
                this.A = size;
                this.C = size;
            }
            if (arrayList6.isEmpty()) {
                this.D = -1;
                this.E = -1;
            } else {
                int i13 = this.A;
                this.D = i13;
                int size2 = arrayList6.size() + i13;
                this.A = size2;
                this.E = size2;
            }
        } else {
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
        }
        sd0 sd0Var = new sd0(this, parentActivity, parentActivity);
        sd0Var.setWillNotDraw(false);
        this.containerView = sd0Var;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.f27074b = new yd0(this);
        td0 td0Var = new td0(this, parentActivity);
        this.f27075c = td0Var;
        td0Var.setClipToPadding(false);
        td0Var.setVerticalScrollBarEnabled(false);
        sd0Var.addView(td0Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        td0Var.addView(linearLayout, h7.z5.x(-1, -1, 51));
        td0Var.setOnScrollChangeListener(new qd0(this));
        int i14 = this.A;
        for (final int i15 = 0; i15 < i14; i15++) {
            ViewGroup viewGroupA = this.f27074b.a(parentActivity, i15);
            this.d.addView(viewGroupA, h7.z5.n(-1, -2));
            if ((i15 >= this.B && i15 < this.C) || (i15 >= this.D && i15 < this.E)) {
                viewGroupA.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                viewGroupA.setOnClickListener(new gh.v2(this, i15, viewGroupA, 11));
                viewGroupA.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        return be0.n(this.f32140a, i15, c6Var, parentActivity);
                    }
                });
            }
        }
        ud0 ud0Var = new ud0(this, parentActivity);
        this.f27076e = ud0Var;
        ud0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
        ud0Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i16 = org.telegram.ui.ActionBar.g6.f23161j5;
        ud0Var.D(getThemedColor(i16), false);
        ud0Var.C(getThemedColor(org.telegram.ui.ActionBar.g6.I5), false);
        ud0Var.setTitleColor(getThemedColor(i16));
        ud0Var.setOccupyStatusBar(false);
        ud0Var.setAlpha(0.0f);
        if (this.F) {
            ud0Var.setTitle(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            ud0Var.setTitle(LocaleController.getString(R.string.ShareContactTitle));
        }
        this.containerView.addView(ud0Var, h7.z5.c(-2.0f, -1));
        ud0Var.setActionBarMenuOnItemClick(new vd0(this));
        View view = new View(parentActivity);
        this.f27077f = view;
        view.setAlpha(0.0f);
        int i17 = org.telegram.ui.ActionBar.g6.V5;
        view.setBackgroundColor(getThemedColor(i17));
        this.containerView.addView(view, h7.z5.c(1.0f, -1));
        View view2 = new View(parentActivity);
        this.h = view2;
        view2.setBackgroundColor(getThemedColor(i17));
        view2.setAlpha(0.0f);
        this.containerView.addView(view2, h7.z5.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView = new TextView(parentActivity);
        this.f27078n = textView;
        textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView.setGravity(17);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView.setTextSize(1, 14.0f);
        if (this.F) {
            textView.setText(LocaleController.getString(R.string.AddContactPhonebookTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.ShareContactTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(8.0f);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, themedColor, themedColor2, themedColor2));
        sd0Var.addView(textView, h7.z5.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView.setOnClickListener(new q2(28, this, c6Var));
    }

    public static void m(be0 be0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        ArrayList arrayList = be0Var.H;
        ArrayList arrayList2 = be0Var.I;
        org.telegram.ui.ActionBar.n2 n2Var = be0Var.f27079r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = be0Var.J;
        if (be0Var.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(be0Var.getContext());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new wd0(be0Var));
            alertDialog$Builder.o();
            return;
        }
        StringBuilder sb2 = !tL_userContact_old2.restriction_reason.isEmpty() ? new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text) : new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        int iLastIndexOf = sb2.lastIndexOf("END:VCARD");
        if (iLastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i10 = 0; i10 < vcardItem.vcardData.size(); i10++) {
                        sb2.insert(iLastIndexOf, vcardItem.vcardData.get(i10) + "\n");
                    }
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb2.insert(iLastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb2.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        boolean z10 = n2Var instanceof org.telegram.ui.rn;
        if (z10) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
            if (rnVar.c()) {
                y4.M(be0Var.getContext(), rnVar.a(), new qd0(be0Var), c6Var);
                return;
            }
        }
        y4.a0(be0Var.currentAccount, 1, z10 ? ((org.telegram.ui.rn) n2Var).a() : 0L, new v2(be0Var, 9));
    }

    public static boolean n(be0 be0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = be0Var.B;
        if (i10 < i11 || i10 >= be0Var.C) {
            int i12 = be0Var.D;
            vcardItem = (i10 < i12 || i10 >= be0Var.E) ? null : (AndroidUtilities.VcardItem) be0Var.H.get(i10 - i12);
        } else {
            vcardItem = (AndroidUtilities.VcardItem) be0Var.I.get(i10 - i11);
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (mc.a(be0Var.f27079r)) {
            if (vcardItem.type == 3) {
                new mc((FrameLayout) be0Var.containerView, c6Var).k(false).j();
                return true;
            }
            wb wbVar = new wb(context, c6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                wbVar.f34154b.setText(LocaleController.getString(R.string.PhoneCopied));
                wbVar.f34153a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                wbVar.f34154b.setText(LocaleController.getString(R.string.EmailCopied));
                wbVar.f34153a.setImageResource(R.drawable.msg_mention);
            } else {
                wbVar.f34154b.setText(LocaleController.getString(R.string.TextCopied));
                wbVar.f34153a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                ec.f((FrameLayout) be0Var.containerView, wbVar, 1500).j();
            }
        }
        return true;
    }

    public final void H(boolean z10) {
        Integer num = 1;
        td0 td0Var = this.f27075c;
        View childAt = td0Var.getChildAt(0);
        int top = childAt.getTop() - td0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z11 = top <= 0;
        ud0 ud0Var = this.f27076e;
        if ((z11 && ud0Var.getTag() == null) || (!z11 && ud0Var.getTag() != null)) {
            ud0Var.setTag(z11 ? num : null);
            AnimatorSet animatorSet = this.f27082x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f27082x = null;
            }
            View view = this.f27077f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f27082x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f27082x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ud0Var, (Property<ud0, Float>) property, z11 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z11 ? 1.0f : 0.0f));
                this.f27082x.addListener(new xd0(this, 0));
                this.f27082x.start();
            } else {
                ud0Var.setAlpha(z11 ? 1.0f : 0.0f);
                view.setAlpha(z11 ? 1.0f : 0.0f);
            }
        }
        if (this.f27081w != top) {
            this.f27081w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        td0Var.getMeasuredHeight();
        boolean z12 = childAt.getBottom() - td0Var.getScrollY() > td0Var.getMeasuredHeight();
        View view2 = this.h;
        if (!(z12 && view2.getTag() == null) && (z12 || view2.getTag() == null)) {
            return;
        }
        view2.setTag(z12 ? 1 : null);
        AnimatorSet animatorSet4 = this.f27083y;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.f27083y = null;
        }
        if (!z10) {
            view2.setAlpha(z12 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f27083y = animatorSet5;
        animatorSet5.setDuration(180L);
        this.f27083y.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, z12 ? 1.0f : 0.0f));
        this.f27083y.addListener(new xd0(this, 1));
        this.f27083y.start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onStart() {
        super.onStart();
        ec.a((FrameLayout) this.containerView, new cg.w(12));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ec.h((FrameLayout) this.containerView);
    }
}

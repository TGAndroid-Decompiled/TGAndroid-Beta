package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uf0 extends org.telegram.ui.ActionBar.e3 {
    public static final int O = 0;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public vj K;
    public final ArrayList L;
    public final ArrayList M;
    public final TLRPC.TL_userContact_old2 N;
    public final rf0 f31147b;
    public final mf0 f31148c;
    public final LinearLayout d;
    public final nf0 f31149e;
    public final View f31150f;
    public final View h;
    public final TextView f31151n;
    public final org.telegram.ui.ActionBar.m2 f31152r;
    public boolean f31153s;
    public final Paint v;
    public int f31154w;
    public AnimatorSet f31155x;
    public AnimatorSet f31156y;

    public uf0(org.telegram.ui.ActionBar.m2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.c6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uf0.<init>(org.telegram.ui.ActionBar.m2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.c6):void");
    }

    public static void o(uf0 uf0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        StringBuilder sb2;
        long j3;
        ArrayList arrayList = uf0Var.L;
        ArrayList arrayList2 = uf0Var.M;
        org.telegram.ui.ActionBar.m2 m2Var = uf0Var.f31152r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = uf0Var.N;
        if (uf0Var.J) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uf0Var.getContext());
            alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new pf0(uf0Var));
            alertDialog$Builder.o();
            return;
        }
        if (!tL_userContact_old2.restriction_reason.isEmpty()) {
            sb2 = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
        } else {
            sb2 = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        }
        int lastIndexOf = sb2.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i10 = 0; i10 < vcardItem.vcardData.size(); i10++) {
                        sb2.insert(lastIndexOf, vcardItem.vcardData.get(i10) + "\n");
                    }
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb2.insert(lastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
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
        boolean z10 = m2Var instanceof org.telegram.ui.eo;
        if (z10) {
            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
            if (eoVar.c()) {
                g5.L(uf0Var.getContext(), eoVar.a(), new jf0(uf0Var), c6Var);
                return;
            }
        }
        if (z10) {
            j3 = ((org.telegram.ui.eo) m2Var).a();
        } else {
            j3 = 0;
        }
        g5.Z(uf0Var.currentAccount, 1, j3, new a3(uf0Var, 10));
    }

    public static boolean p(uf0 uf0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = uf0Var.F;
        if (i10 >= i11 && i10 < uf0Var.G) {
            vcardItem = (AndroidUtilities.VcardItem) uf0Var.M.get(i10 - i11);
        } else {
            int i12 = uf0Var.H;
            if (i10 >= i12 && i10 < uf0Var.I) {
                vcardItem = (AndroidUtilities.VcardItem) uf0Var.L.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (zc.a(uf0Var.f31152r)) {
            if (vcardItem.type == 3) {
                new zc((FrameLayout) uf0Var.containerView, c6Var).k(false).j();
                return true;
            }
            kc kcVar = new kc(context, c6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                kcVar.f27821b.setText(LocaleController.getString(R.string.PhoneCopied));
                kcVar.f27820a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                kcVar.f27821b.setText(LocaleController.getString(R.string.EmailCopied));
                kcVar.f27820a.setImageResource(R.drawable.msg_mention);
            } else {
                kcVar.f27821b.setText(LocaleController.getString(R.string.TextCopied));
                kcVar.f27820a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                sc.f((FrameLayout) uf0Var.containerView, kcVar, 1500).j();
            }
        }
        return true;
    }

    public final void I(boolean z10) {
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        Integer num;
        float f11;
        float f12;
        float f13;
        float f14;
        Integer num2 = 1;
        mf0 mf0Var = this.f31148c;
        View childAt = mf0Var.getChildAt(0);
        int top = childAt.getTop() - mf0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        nf0 nf0Var = this.f31149e;
        if ((z11 && nf0Var.getTag() == null) || (!z11 && nf0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            nf0Var.setTag(num);
            AnimatorSet animatorSet = this.f31155x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31155x = null;
            }
            View view = this.f31150f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31155x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f31155x;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nf0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f31155x.addListener(new qf0(this, 0));
                this.f31155x.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nf0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f31154w != top) {
            this.f31154w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        mf0Var.getMeasuredHeight();
        if (childAt.getBottom() - mf0Var.getScrollY() > mf0Var.getMeasuredHeight()) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view2 = this.h;
        if ((z12 && view2.getTag() == null) || (!z12 && view2.getTag() != null)) {
            if (!z12) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f31156y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f31156y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f31156y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f31156y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f31156y.addListener(new qf0(this, 1));
                this.f31156y.start();
                return;
            }
            if (z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            view2.setAlpha(f7);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onStart() {
        super.onStart();
        sc.a((FrameLayout) this.containerView, new ci.a9(8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        sc.h((FrameLayout) this.containerView);
    }
}

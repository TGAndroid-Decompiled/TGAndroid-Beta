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
public final class ke0 extends org.telegram.ui.ActionBar.f3 {
    public static final int K = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public ij G;
    public final ArrayList H;
    public final ArrayList I;
    public final TLRPC.TL_userContact_old2 J;
    public final he0 f30023b;
    public final ce0 f30024c;
    public final LinearLayout d;
    public final de0 f30025e;
    public final View f30026f;
    public final View h;
    public final TextView f30027n;
    public final org.telegram.ui.ActionBar.o2 f30028r;
    public boolean f30029s;
    public final Paint v;
    public int f30030w;
    public AnimatorSet f30031x;
    public AnimatorSet f30032y;

    public ke0(org.telegram.ui.ActionBar.o2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.c6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ke0.<init>(org.telegram.ui.ActionBar.o2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.c6):void");
    }

    public static void m(ke0 ke0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        StringBuilder sb2;
        long j10;
        ArrayList arrayList = ke0Var.H;
        ArrayList arrayList2 = ke0Var.I;
        org.telegram.ui.ActionBar.o2 o2Var = ke0Var.f30028r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = ke0Var.J;
        if (ke0Var.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke0Var.getContext());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new fe0(ke0Var));
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
        boolean z10 = o2Var instanceof org.telegram.ui.tn;
        if (z10) {
            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
            if (tnVar.c()) {
                c5.M(ke0Var.getContext(), tnVar.a(), new zd0(ke0Var), c6Var);
                return;
            }
        }
        if (z10) {
            j10 = ((org.telegram.ui.tn) o2Var).a();
        } else {
            j10 = 0;
        }
        c5.a0(ke0Var.currentAccount, 1, j10, new y2(ke0Var, 9));
    }

    public static boolean n(ke0 ke0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = ke0Var.B;
        if (i10 >= i11 && i10 < ke0Var.C) {
            vcardItem = (AndroidUtilities.VcardItem) ke0Var.I.get(i10 - i11);
        } else {
            int i12 = ke0Var.D;
            if (i10 >= i12 && i10 < ke0Var.E) {
                vcardItem = (AndroidUtilities.VcardItem) ke0Var.H.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (tc.a(ke0Var.f30028r)) {
            if (vcardItem.type == 3) {
                new tc((FrameLayout) ke0Var.containerView, c6Var).k(false).j();
                return true;
            }
            ec ecVar = new ec(context, c6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                ecVar.f28000b.setText(LocaleController.getString(R.string.PhoneCopied));
                ecVar.f27999a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                ecVar.f28000b.setText(LocaleController.getString(R.string.EmailCopied));
                ecVar.f27999a.setImageResource(R.drawable.msg_mention);
            } else {
                ecVar.f28000b.setText(LocaleController.getString(R.string.TextCopied));
                ecVar.f27999a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                mc.f((FrameLayout) ke0Var.containerView, ecVar, 1500).j();
            }
        }
        return true;
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        float f9;
        float f10;
        Integer num;
        float f11;
        float f12;
        float f13;
        float f14;
        Integer num2 = 1;
        ce0 ce0Var = this.f30024c;
        View childAt = ce0Var.getChildAt(0);
        int top = childAt.getTop() - ce0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        de0 de0Var = this.f30025e;
        if ((z11 && de0Var.getTag() == null) || (!z11 && de0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            de0Var.setTag(num);
            AnimatorSet animatorSet = this.f30031x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f30031x = null;
            }
            View view = this.f30026f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f30031x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f30031x;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(de0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f30031x.addListener(new ge0(this, 0));
                this.f30031x.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                de0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f30030w != top) {
            this.f30030w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        ce0Var.getMeasuredHeight();
        if (childAt.getBottom() - ce0Var.getScrollY() > ce0Var.getMeasuredHeight()) {
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
            AnimatorSet animatorSet4 = this.f30032y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f30032y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f30032y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f30032y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f30032y.addListener(new ge0(this, 1));
                this.f30032y.start();
                return;
            }
            if (z12) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            view2.setAlpha(f9);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onStart() {
        super.onStart();
        mc.a((FrameLayout) this.containerView, new eg.x(10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        mc.h((FrameLayout) this.containerView);
    }
}

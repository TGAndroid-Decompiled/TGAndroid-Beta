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
public final class wd0 extends org.telegram.ui.ActionBar.f3 {
    public static final int K = 0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public fj G;
    public final ArrayList H;
    public final ArrayList I;
    public final TLRPC.TL_userContact_old2 J;
    public final td0 f34206b;
    public final od0 f34207c;
    public final LinearLayout d;
    public final pd0 f34208e;
    public final View f34209f;
    public final View h;
    public final TextView f34210n;
    public final org.telegram.ui.ActionBar.o2 f34211r;
    public boolean f34212s;
    public final Paint v;
    public int f34213w;
    public AnimatorSet f34214x;
    public AnimatorSet f34215y;

    public wd0(org.telegram.ui.ActionBar.o2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.b6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wd0.<init>(org.telegram.ui.ActionBar.o2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.b6):void");
    }

    public static void m(wd0 wd0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        StringBuilder sb2;
        long j10;
        ArrayList arrayList = wd0Var.H;
        ArrayList arrayList2 = wd0Var.I;
        org.telegram.ui.ActionBar.o2 o2Var = wd0Var.f34211r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = wd0Var.J;
        if (wd0Var.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wd0Var.getContext());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new rd0(wd0Var));
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
                    for (int i9 = 0; i9 < vcardItem.vcardData.size(); i9++) {
                        sb2.insert(lastIndexOf, vcardItem.vcardData.get(i9) + "\n");
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
        boolean z10 = o2Var instanceof org.telegram.ui.qn;
        if (z10) {
            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
            if (qnVar.c()) {
                y4.M(wd0Var.getContext(), qnVar.a(), new ld0(wd0Var), b6Var);
                return;
            }
        }
        if (z10) {
            j10 = ((org.telegram.ui.qn) o2Var).a();
        } else {
            j10 = 0;
        }
        y4.a0(wd0Var.currentAccount, 1, j10, new v2(wd0Var, 9));
    }

    public static boolean n(wd0 wd0Var, int i9, org.telegram.ui.ActionBar.b6 b6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i10 = wd0Var.B;
        if (i9 >= i10 && i9 < wd0Var.C) {
            vcardItem = (AndroidUtilities.VcardItem) wd0Var.I.get(i9 - i10);
        } else {
            int i11 = wd0Var.D;
            if (i9 >= i11 && i9 < wd0Var.E) {
                vcardItem = (AndroidUtilities.VcardItem) wd0Var.H.get(i9 - i11);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (oc.a(wd0Var.f34211r)) {
            if (vcardItem.type == 3) {
                new oc((FrameLayout) wd0Var.containerView, b6Var).k(false).j();
                return true;
            }
            yb ybVar = new yb(context, b6Var);
            int i12 = vcardItem.type;
            if (i12 == 0) {
                ybVar.f34916b.setText(LocaleController.getString(R.string.PhoneCopied));
                ybVar.f34915a.setImageResource(R.drawable.msg_calls);
            } else if (i12 == 1) {
                ybVar.f34916b.setText(LocaleController.getString(R.string.EmailCopied));
                ybVar.f34915a.setImageResource(R.drawable.msg_mention);
            } else {
                ybVar.f34916b.setText(LocaleController.getString(R.string.TextCopied));
                ybVar.f34915a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                gc.f((FrameLayout) wd0Var.containerView, ybVar, 1500).j();
            }
        }
        return true;
    }

    public final void G(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        Integer num;
        float f12;
        float f13;
        float f14;
        float f15;
        Integer num2 = 1;
        od0 od0Var = this.f34207c;
        View childAt = od0Var.getChildAt(0);
        int top = childAt.getTop() - od0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        pd0 pd0Var = this.f34208e;
        if ((z11 && pd0Var.getTag() == null) || (!z11 && pd0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            pd0Var.setTag(num);
            AnimatorSet animatorSet = this.f34214x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f34214x = null;
            }
            View view = this.f34209f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f34214x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f34214x;
                Property property = View.ALPHA;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pd0Var, property, f14);
                if (z11) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f34214x.addListener(new sd0(this, 0));
                this.f34214x.start();
            } else {
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                pd0Var.setAlpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f34213w != top) {
            this.f34213w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        od0Var.getMeasuredHeight();
        if (childAt.getBottom() - od0Var.getScrollY() > od0Var.getMeasuredHeight()) {
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
            AnimatorSet animatorSet4 = this.f34215y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f34215y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f34215y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f34215y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f34215y.addListener(new sd0(this, 1));
                this.f34215y.start();
                return;
            }
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            view2.setAlpha(f10);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void onStart() {
        super.onStart();
        gc.a((FrameLayout) this.containerView, new bg.z(12));
    }

    @Override
    public final void onStop() {
        super.onStop();
        gc.h((FrameLayout) this.containerView);
    }
}

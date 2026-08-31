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
public final class ue0 extends org.telegram.ui.ActionBar.h3 {
    public static final int L = 0;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public ij H;
    public final ArrayList I;
    public final ArrayList J;
    public final TLRPC.TL_userContact_old2 K;
    public final re0 f31662b;
    public final me0 f31663c;
    public final LinearLayout d;
    public final ne0 f31664e;
    public final View f31665f;
    public final View h;
    public final TextView f31666n;
    public final org.telegram.ui.ActionBar.p2 f31667r;
    public boolean f31668s;
    public final Paint v;
    public int f31669w;
    public AnimatorSet f31670x;
    public AnimatorSet f31671y;

    public ue0(org.telegram.ui.ActionBar.p2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.g6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ue0.<init>(org.telegram.ui.ActionBar.p2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.g6):void");
    }

    public static void m(ue0 ue0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        StringBuilder sb;
        long j10;
        ArrayList arrayList = ue0Var.I;
        ArrayList arrayList2 = ue0Var.J;
        org.telegram.ui.ActionBar.p2 p2Var = ue0Var.f31667r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = ue0Var.K;
        if (ue0Var.G) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ue0Var.getContext());
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new pe0(ue0Var));
            alertDialog$Builder.o();
            return;
        }
        if (!tL_userContact_old2.restriction_reason.isEmpty()) {
            sb = new StringBuilder(tL_userContact_old2.restriction_reason.get(0).text);
        } else {
            sb = new StringBuilder(String.format(Locale.US, "BEGIN:VCARD\nVERSION:3.0\nFN:%1$s\nEND:VCARD", ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name)));
        }
        int lastIndexOf = sb.lastIndexOf("END:VCARD");
        if (lastIndexOf >= 0) {
            tL_userContact_old2.phone = null;
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(size);
                if (vcardItem.checked) {
                    if (tL_userContact_old2.phone == null) {
                        tL_userContact_old2.phone = vcardItem.getValue(false);
                    }
                    for (int i10 = 0; i10 < vcardItem.vcardData.size(); i10++) {
                        sb.insert(lastIndexOf, vcardItem.vcardData.get(i10) + "\n");
                    }
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AndroidUtilities.VcardItem vcardItem2 = (AndroidUtilities.VcardItem) arrayList.get(size2);
                if (vcardItem2.checked) {
                    for (int size3 = vcardItem2.vcardData.size() - 1; size3 >= 0; size3 += -1) {
                        sb.insert(lastIndexOf, vcardItem2.vcardData.get(size3) + "\n");
                    }
                }
            }
            tL_userContact_old2.restriction_reason.clear();
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = sb.toString();
            restrictionReason.reason = "";
            restrictionReason.platform = "";
            tL_userContact_old2.restriction_reason.add(restrictionReason);
        }
        boolean z4 = p2Var instanceof org.telegram.ui.xn;
        if (z4) {
            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
            if (xnVar.c()) {
                z4.M(ue0Var.getContext(), xnVar.a(), new je0(ue0Var), g6Var);
                return;
            }
        }
        if (z4) {
            j10 = ((org.telegram.ui.xn) p2Var).a();
        } else {
            j10 = 0;
        }
        z4.a0(ue0Var.currentAccount, 1, j10, new v2(ue0Var, 9));
    }

    public static boolean n(ue0 ue0Var, int i10, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = ue0Var.C;
        if (i10 >= i11 && i10 < ue0Var.D) {
            vcardItem = (AndroidUtilities.VcardItem) ue0Var.J.get(i10 - i11);
        } else {
            int i12 = ue0Var.E;
            if (i10 >= i12 && i10 < ue0Var.F) {
                vcardItem = (AndroidUtilities.VcardItem) ue0Var.I.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (qc.a(ue0Var.f31667r)) {
            if (vcardItem.type == 3) {
                new qc((FrameLayout) ue0Var.containerView, g6Var).k(false).j();
                return true;
            }
            ac acVar = new ac(context, g6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                acVar.f25219b.setText(LocaleController.getString(R.string.PhoneCopied));
                acVar.f25218a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                acVar.f25219b.setText(LocaleController.getString(R.string.EmailCopied));
                acVar.f25218a.setImageResource(R.drawable.msg_mention);
            } else {
                acVar.f25219b.setText(LocaleController.getString(R.string.TextCopied));
                acVar.f25218a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                ic.f((FrameLayout) ue0Var.containerView, acVar, 1500).j();
            }
        }
        return true;
    }

    public final void G(boolean z4) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        Integer num;
        float f12;
        float f13;
        float f14;
        float f15;
        Integer num2 = 1;
        me0 me0Var = this.f31663c;
        View childAt = me0Var.getChildAt(0);
        int top = childAt.getTop() - me0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ne0 ne0Var = this.f31664e;
        if ((z10 && ne0Var.getTag() == null) || (!z10 && ne0Var.getTag() != null)) {
            if (z10) {
                num = num2;
            } else {
                num = null;
            }
            ne0Var.setTag(num);
            AnimatorSet animatorSet = this.f31670x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31670x = null;
            }
            View view = this.f31665f;
            if (z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31670x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f31670x;
                Property property = View.ALPHA;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ne0Var, property, f14);
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f31670x.addListener(new qe0(this, 0));
                this.f31670x.start();
            } else {
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ne0Var.setAlpha(f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f31669w != top) {
            this.f31669w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        me0Var.getMeasuredHeight();
        if (childAt.getBottom() - me0Var.getScrollY() > me0Var.getMeasuredHeight()) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view2 = this.h;
        if ((z11 && view2.getTag() == null) || (!z11 && view2.getTag() != null)) {
            if (!z11) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f31671y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f31671y = null;
            }
            if (z4) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f31671y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f31671y;
                Property property2 = View.ALPHA;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f31671y.addListener(new qe0(this, 1));
                this.f31671y.start();
                return;
            }
            if (z11) {
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
        ic.a((FrameLayout) this.containerView, new hg.w(7));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ic.h((FrameLayout) this.containerView);
    }
}

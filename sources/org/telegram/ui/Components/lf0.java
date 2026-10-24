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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lf0 extends org.telegram.ui.ActionBar.h3 {
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public mj K;
    public final ArrayList L;
    public final ArrayList M;
    public final TLRPC.TL_userContact_old2 N;
    public final if0 f28325b;
    public final df0 f28326c;
    public final LinearLayout d;
    public final ef0 e;
    public final View f28327f;
    public final View h;
    public final TextView f28328n;
    public final org.telegram.ui.ActionBar.o2 f28329r;
    public boolean f28330s;
    public final Paint v;
    public int f28331w;
    public AnimatorSet f28332x;
    public AnimatorSet f28333y;

    public lf0(org.telegram.ui.ActionBar.o2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.g6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lf0.<init>(org.telegram.ui.ActionBar.o2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.g6):void");
    }

    public static void m(lf0 lf0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        StringBuilder sb2;
        long j10;
        ArrayList arrayList = lf0Var.L;
        ArrayList arrayList2 = lf0Var.M;
        org.telegram.ui.ActionBar.o2 o2Var = lf0Var.f28329r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = lf0Var.N;
        if (lf0Var.J) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lf0Var.getContext());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new gf0(lf0Var));
            alertDialog$Builder.p();
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
        boolean z10 = o2Var instanceof org.telegram.ui.sn;
        if (z10) {
            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var;
            if (snVar.c()) {
                d5.L(lf0Var.getContext(), snVar.a(), new af0(lf0Var), g6Var);
                return;
            }
        }
        if (z10) {
            j10 = ((org.telegram.ui.sn) o2Var).a();
        } else {
            j10 = 0;
        }
        d5.Z(lf0Var.currentAccount, 1, j10, new x2(lf0Var, 10));
    }

    public static boolean n(lf0 lf0Var, int i10, org.telegram.ui.ActionBar.g6 g6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = lf0Var.F;
        if (i10 >= i11 && i10 < lf0Var.G) {
            vcardItem = (AndroidUtilities.VcardItem) lf0Var.M.get(i10 - i11);
        } else {
            int i12 = lf0Var.H;
            if (i10 >= i12 && i10 < lf0Var.I) {
                vcardItem = (AndroidUtilities.VcardItem) lf0Var.L.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (vc.a(lf0Var.f28329r)) {
            if (vcardItem.type == 3) {
                new vc((FrameLayout) lf0Var.containerView, g6Var).k(false).j();
                return true;
            }
            gc gcVar = new gc(context, g6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                gcVar.f26619b.setText(LocaleController.getString(R.string.PhoneCopied));
                gcVar.f26618a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                gcVar.f26619b.setText(LocaleController.getString(R.string.EmailCopied));
                gcVar.f26618a.setImageResource(R.drawable.msg_mention);
            } else {
                gcVar.f26619b.setText(LocaleController.getString(R.string.TextCopied));
                gcVar.f26618a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                oc.f((FrameLayout) lf0Var.containerView, gcVar, 1500).j();
            }
        }
        return true;
    }

    public final void M() {
        TextView textView = this.f28328n;
        if (textView != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Sh);
            if (!textView.isEnabled()) {
                themedColor &= Integer.MAX_VALUE;
            }
            if (textView.getCurrentTextColor() != themedColor) {
                textView.setTextColor(themedColor);
            }
        }
    }

    public final void N(boolean z10) {
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
        df0 df0Var = this.f28326c;
        View childAt = df0Var.getChildAt(0);
        int top = childAt.getTop() - df0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ef0 ef0Var = this.e;
        if ((z11 && ef0Var.getTag() == null) || (!z11 && ef0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            ef0Var.setTag(num);
            AnimatorSet animatorSet = this.f28332x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f28332x = null;
            }
            View view = this.f28327f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f28332x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f28332x;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ef0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f28332x.addListener(new hf0(this, 0));
                this.f28332x.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ef0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f28331w != top) {
            this.f28331w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        df0Var.getMeasuredHeight();
        if (childAt.getBottom() - df0Var.getScrollY() > df0Var.getMeasuredHeight()) {
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
            AnimatorSet animatorSet4 = this.f28333y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f28333y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f28333y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f28333y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f28333y.addListener(new hf0(this, 1));
                this.f28333y.start();
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
        oc.a((FrameLayout) this.containerView, new ei.o8(8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        oc.h((FrameLayout) this.containerView);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            M();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

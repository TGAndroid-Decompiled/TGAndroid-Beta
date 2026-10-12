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
public final class of0 extends org.telegram.ui.ActionBar.e3 {
    public static final int O = 0;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public qj K;
    public final ArrayList L;
    public final ArrayList M;
    public final TLRPC.TL_userContact_old2 N;
    public final lf0 f27944b;
    public final gf0 f27945c;
    public final LinearLayout d;
    public final hf0 e;
    public final View f27946f;
    public final View h;
    public final TextView f27947n;
    public final org.telegram.ui.ActionBar.m2 f27948r;
    public boolean f27949s;
    public final Paint v;
    public int f27950w;
    public AnimatorSet f27951x;
    public AnimatorSet f27952y;

    public of0(org.telegram.ui.ActionBar.m2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.c6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.of0.<init>(org.telegram.ui.ActionBar.m2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.c6):void");
    }

    public static void n(of0 of0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        StringBuilder sb2;
        long j10;
        ArrayList arrayList = of0Var.L;
        ArrayList arrayList2 = of0Var.M;
        org.telegram.ui.ActionBar.m2 m2Var = of0Var.f27948r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = of0Var.N;
        if (of0Var.J) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(of0Var.getContext());
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new jf0(of0Var));
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
        boolean z10 = m2Var instanceof org.telegram.ui.fo;
        if (z10) {
            org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
            if (foVar.c()) {
                g5.L(of0Var.getContext(), foVar.a(), new df0(of0Var), c6Var);
                return;
            }
        }
        if (z10) {
            j10 = ((org.telegram.ui.fo) m2Var).a();
        } else {
            j10 = 0;
        }
        g5.Z(of0Var.currentAccount, 1, j10, new a3(of0Var, 10));
    }

    public static boolean o(of0 of0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = of0Var.F;
        if (i10 >= i11 && i10 < of0Var.G) {
            vcardItem = (AndroidUtilities.VcardItem) of0Var.M.get(i10 - i11);
        } else {
            int i12 = of0Var.H;
            if (i10 >= i12 && i10 < of0Var.I) {
                vcardItem = (AndroidUtilities.VcardItem) of0Var.L.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (zc.a(of0Var.f27948r)) {
            if (vcardItem.type == 3) {
                new zc((FrameLayout) of0Var.containerView, c6Var).k(false).j();
                return true;
            }
            kc kcVar = new kc(context, c6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                kcVar.f26665b.setText(LocaleController.getString(R.string.PhoneCopied));
                kcVar.f26664a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                kcVar.f26665b.setText(LocaleController.getString(R.string.EmailCopied));
                kcVar.f26664a.setImageResource(R.drawable.msg_mention);
            } else {
                kcVar.f26665b.setText(LocaleController.getString(R.string.TextCopied));
                kcVar.f26664a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                sc.f((FrameLayout) of0Var.containerView, kcVar, 1500).j();
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
        gf0 gf0Var = this.f27945c;
        View childAt = gf0Var.getChildAt(0);
        int top = childAt.getTop() - gf0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hf0 hf0Var = this.e;
        if ((z11 && hf0Var.getTag() == null) || (!z11 && hf0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            hf0Var.setTag(num);
            AnimatorSet animatorSet = this.f27951x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f27951x = null;
            }
            View view = this.f27946f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f27951x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f27951x;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hf0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f27951x.addListener(new kf0(this, 0));
                this.f27951x.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                hf0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f27950w != top) {
            this.f27950w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        gf0Var.getMeasuredHeight();
        if (childAt.getBottom() - gf0Var.getScrollY() > gf0Var.getMeasuredHeight()) {
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
            AnimatorSet animatorSet4 = this.f27952y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f27952y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f27952y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f27952y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f27952y.addListener(new kf0(this, 1));
                this.f27952y.start();
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
        sc.a((FrameLayout) this.containerView, new di.z8(8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        sc.h((FrameLayout) this.containerView);
    }
}

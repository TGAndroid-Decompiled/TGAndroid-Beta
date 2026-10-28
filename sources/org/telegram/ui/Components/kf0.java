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
public final class kf0 extends org.telegram.ui.ActionBar.k3 {
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public oj K;
    public final ArrayList L;
    public final ArrayList M;
    public final TLRPC.TL_userContact_old2 N;
    public final hf0 f29944b;
    public final cf0 f29945c;
    public final LinearLayout d;
    public final df0 e;
    public final View f29946f;
    public final View h;
    public final TextView f29947n;
    public final org.telegram.ui.ActionBar.r2 f29948r;
    public boolean f29949s;
    public final Paint v;
    public int f29950w;
    public AnimatorSet f29951x;
    public AnimatorSet f29952y;

    public kf0(org.telegram.ui.ActionBar.r2 r14, org.telegram.messenger.ContactsController.Contact r15, org.telegram.tgnet.TLRPC.User r16, android.net.Uri r17, java.io.File r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, final org.telegram.ui.ActionBar.u6 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kf0.<init>(org.telegram.ui.ActionBar.r2, org.telegram.messenger.ContactsController$Contact, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.u6):void");
    }

    public static void m(kf0 kf0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        StringBuilder sb2;
        long j10;
        ArrayList arrayList = kf0Var.L;
        ArrayList arrayList2 = kf0Var.M;
        org.telegram.ui.ActionBar.r2 r2Var = kf0Var.f29948r;
        TLRPC.TL_userContact_old2 tL_userContact_old2 = kf0Var.N;
        if (kf0Var.J) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kf0Var.getContext());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AddContactTitle);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.CreateNewContact), LocaleController.getString(R.string.AddToExistingContact)}, new ff0(kf0Var));
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
        boolean z10 = r2Var instanceof org.telegram.ui.wn;
        if (z10) {
            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var;
            if (wnVar.c()) {
                g5.L(kf0Var.getContext(), wnVar.a(), new ze0(kf0Var), u6Var);
                return;
            }
        }
        if (z10) {
            j10 = ((org.telegram.ui.wn) r2Var).a();
        } else {
            j10 = 0;
        }
        g5.Z(kf0Var.currentAccount, 1, j10, new b3(kf0Var, 9));
    }

    public static boolean n(kf0 kf0Var, int i10, org.telegram.ui.ActionBar.u6 u6Var, Context context) {
        AndroidUtilities.VcardItem vcardItem;
        int i11 = kf0Var.F;
        if (i10 >= i11 && i10 < kf0Var.G) {
            vcardItem = (AndroidUtilities.VcardItem) kf0Var.M.get(i10 - i11);
        } else {
            int i12 = kf0Var.H;
            if (i10 >= i12 && i10 < kf0Var.I) {
                vcardItem = (AndroidUtilities.VcardItem) kf0Var.L.get(i10 - i12);
            } else {
                vcardItem = null;
            }
        }
        if (vcardItem == null) {
            return false;
        }
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
        if (wc.a(kf0Var.f29948r)) {
            if (vcardItem.type == 3) {
                new wc((FrameLayout) kf0Var.containerView, u6Var).k(false).j();
                return true;
            }
            ic icVar = new ic(context, u6Var);
            int i13 = vcardItem.type;
            if (i13 == 0) {
                icVar.f29300b.setText(LocaleController.getString(R.string.PhoneCopied));
                icVar.f29299a.setImageResource(R.drawable.msg_calls);
            } else if (i13 == 1) {
                icVar.f29300b.setText(LocaleController.getString(R.string.EmailCopied));
                icVar.f29299a.setImageResource(R.drawable.msg_mention);
            } else {
                icVar.f29300b.setText(LocaleController.getString(R.string.TextCopied));
                icVar.f29299a.setImageResource(R.drawable.msg_info);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                qc.f((FrameLayout) kf0Var.containerView, icVar, 1500).j();
            }
        }
        return true;
    }

    public final void M() {
        TextView textView = this.f29947n;
        if (textView != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Sh);
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
        cf0 cf0Var = this.f29945c;
        View childAt = cf0Var.getChildAt(0);
        int top = childAt.getTop() - cf0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        df0 df0Var = this.e;
        if ((z11 && df0Var.getTag() == null) || (!z11 && df0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            df0Var.setTag(num);
            AnimatorSet animatorSet = this.f29951x;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29951x = null;
            }
            View view = this.f29946f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f29951x = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f29951x;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(df0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f29951x.addListener(new gf0(this, 0));
                this.f29951x.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                df0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f29950w != top) {
            this.f29950w = top;
            this.containerView.invalidate();
        }
        childAt.getBottom();
        cf0Var.getMeasuredHeight();
        if (childAt.getBottom() - cf0Var.getScrollY() > cf0Var.getMeasuredHeight()) {
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
            AnimatorSet animatorSet4 = this.f29952y;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f29952y = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f29952y = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f29952y;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f29952y.addListener(new gf0(this, 1));
                this.f29952y.start();
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
        qc.a((FrameLayout) this.containerView, new fi.k8(7));
    }

    @Override
    public final void onStop() {
        super.onStop();
        qc.h((FrameLayout) this.containerView);
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

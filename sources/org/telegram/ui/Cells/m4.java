package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
public final class m4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.e6 F;
    public long G;
    public int H;
    public sg.c1 I;
    public Drawable J;
    public final org.telegram.ui.Components.x9 f22281a;
    public final bi.c4 f22282b;
    public final org.telegram.ui.Components.i9 f22283c;
    public int d;
    public TLRPC.User f22284e;
    public long f22285f;
    public final int h;
    public float f22286n;
    public boolean f22287r;
    public final vq f22288s;
    public final mp v;
    public final boolean f22289w;
    public boolean f22290x;
    public final org.telegram.ui.Components.e6 f22291y;

    public m4(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f22283c = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        pr prVar = pr.h;
        this.f22291y = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.F = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        this.H = org.telegram.ui.ActionBar.j6.f20664d6;
        this.f22289w = z10;
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f22281a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(x9Var, w7.x5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        bi.c4 c4Var = new bi.c4(context, 5);
        this.f22282b = c4Var;
        NotificationCenter.listenEmojiLoading(c4Var);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        c4Var.setTextSize(1, 12.0f);
        c4Var.setMaxLines(1);
        c4Var.setGravity(49);
        c4Var.setLines(1);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(c4Var, w7.x5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        vq vqVar = new vq(context, f6Var);
        this.f22288s = vqVar;
        addView(vqVar, w7.x5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.W8;
        int i11 = org.telegram.ui.ActionBar.j6.U8;
        uq uqVar = vqVar.f31963a;
        uqVar.v = i10;
        uqVar.f30955w = i11;
        vqVar.setGravity(5);
        if (z10) {
            mp mpVar = new mp(context, 21, f6Var);
            this.v = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f20735h5, org.telegram.ui.ActionBar.j6.C5);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(4);
            mpVar.setProgressDelegate(new la(this, 4));
            addView(mpVar, w7.x5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            mpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f22285f != j3) {
            this.f22287r = false;
            invalidate();
        }
        this.f22285f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.x9 x9Var = this.f22281a;
        org.telegram.ui.Components.i9 i9Var = this.f22283c;
        int i10 = this.h;
        bi.c4 c4Var = this.f22282b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.f22284e = user;
            if (str != null) {
                c4Var.setText(str);
            } else if (user != null) {
                c4Var.setText(UserObject.getFirstName(user));
            } else {
                c4Var.setText("");
            }
            i9Var.m(i10, this.f22284e);
            x9Var.e(this.f22284e, i9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                c4Var.setText(str);
            } else if (chat != null) {
                c4Var.setText(chat.title);
            } else {
                c4Var.setText("");
            }
            i9Var.k(i10, chat);
            this.f22284e = null;
            x9Var.e(chat, i9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f22284e != null) {
            this.f22284e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f22284e.f20016id));
            this.f22281a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f22285f);
            vq vqVar = this.f22288s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    vqVar.f31963a.c(i11, this.f22287r);
                    return;
                }
                return;
            }
            this.d = 0;
            vqVar.f31963a.c(0, this.f22287r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22290x && this.f22284e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f22284e.f20016id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f22291y.f(this.E, true);
            if (this.G > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.F.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f22285f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22289w) {
            org.telegram.ui.Components.x9 x9Var = this.f22281a;
            int measuredWidth = (x9Var.getMeasuredWidth() / 2) + x9Var.getLeft();
            int measuredHeight = (x9Var.getMeasuredHeight() / 2) + x9Var.getTop();
            org.telegram.ui.ActionBar.j6.f20857o0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.f20857o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.f20857o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f22288s.f31963a.E = AndroidUtilities.dp(13.0f);
    }
}

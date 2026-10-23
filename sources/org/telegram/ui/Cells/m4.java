package org.telegram.ui.Cells;

import ai.vd;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.xp;
public final class m4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.f6 F;
    public long G;
    public int H;
    public sg.a1 I;
    public Drawable J;
    public final org.telegram.ui.Components.w9 f22578a;
    public final vd f22579b;
    public final org.telegram.ui.Components.h9 f22580c;
    public int d;
    public TLRPC.User e;
    public long f22581f;
    public final int h;
    public float f22582n;
    public boolean f22583r;
    public final gr f22584s;
    public final xp v;
    public final boolean f22585w;
    public boolean f22586x;
    public final org.telegram.ui.Components.f6 f22587y;

    public m4(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f22580c = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        bs bsVar = bs.h;
        this.f22587y = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.F = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
        this.H = org.telegram.ui.ActionBar.h6.f20994d6;
        this.f22585w = z10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f22578a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(w9Var, w7.z5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        vd vdVar = new vd(context, 6);
        this.f22579b = vdVar;
        NotificationCenter.listenEmojiLoading(vdVar);
        vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        vdVar.setTextSize(1, 12.0f);
        vdVar.setMaxLines(1);
        vdVar.setGravity(49);
        vdVar.setLines(1);
        vdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(vdVar, w7.z5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        gr grVar = new gr(context, d6Var);
        this.f22584s = grVar;
        addView(grVar, w7.z5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.W8;
        int i11 = org.telegram.ui.ActionBar.h6.U8;
        fr frVar = grVar.f26655a;
        frVar.v = i10;
        frVar.f26362w = i11;
        grVar.setGravity(5);
        if (z10) {
            xp xpVar = new xp(context, 21, d6Var);
            this.v = xpVar;
            xpVar.b(org.telegram.ui.ActionBar.h6.B5, org.telegram.ui.ActionBar.h6.f21065h5, org.telegram.ui.ActionBar.h6.C5);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(4);
            xpVar.setProgressDelegate(new ia(this, 4));
            addView(xpVar, w7.z5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            xpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f22581f != j10) {
            this.f22583r = false;
            invalidate();
        }
        this.f22581f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.w9 w9Var = this.f22578a;
        org.telegram.ui.Components.h9 h9Var = this.f22580c;
        int i10 = this.h;
        vd vdVar = this.f22579b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (str != null) {
                vdVar.setText(str);
            } else if (user != null) {
                vdVar.setText(UserObject.getFirstName(user));
            } else {
                vdVar.setText("");
            }
            h9Var.m(i10, this.e);
            w9Var.e(this.e, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                vdVar.setText(str);
            } else if (chat != null) {
                vdVar.setText(chat.title);
            } else {
                vdVar.setText("");
            }
            h9Var.k(i10, chat);
            this.e = null;
            w9Var.e(chat, h9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f20427id));
            this.f22578a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f22581f);
            gr grVar = this.f22584s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    grVar.f26655a.c(i11, this.f22583r);
                    return;
                }
                return;
            }
            this.d = 0;
            grVar.f26655a.c(0, this.f22583r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f22586x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f20427id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f22587y.f(this.E, true);
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
        return this.f22581f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f22585w) {
            org.telegram.ui.Components.w9 w9Var = this.f22578a;
            int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
            int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
            org.telegram.ui.ActionBar.h6.f21191o0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
            org.telegram.ui.ActionBar.h6.f21191o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.f21191o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f22584s.f26655a.E = AndroidUtilities.dp(13.0f);
    }
}

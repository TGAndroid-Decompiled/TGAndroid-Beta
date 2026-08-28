package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph0 extends FrameLayout {
    public final ArrayList f41524a;
    public final ArrayList f41525b;
    public final ArrayList f41526c;
    public final org.telegram.ui.Components.c9 d;
    public final org.telegram.ui.ActionBar.h5 f41527e;
    public final int f41528f;
    public final boolean h;
    public final org.telegram.ui.Components.e00 f41529n;
    public boolean f41530r;
    public va1 f41531s;

    public ph0(Context context, int i9, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i10;
        long j10;
        this.f41524a = new ArrayList();
        this.f41525b = new ArrayList();
        this.f41526c = new ArrayList();
        this.f41528f = i9;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.f41529n = e00Var;
        e00Var.f(org.telegram.ui.ActionBar.f6.G8, org.telegram.ui.ActionBar.f6.f23092i6, -1);
        e00Var.setViewType(13);
        e00Var.setIsSingleCell(false);
        addView(e00Var, g7.e6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41527e = h5Var;
        h5Var.setTextSize(16);
        h5Var.setEllipsizeByGradient(true);
        h5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(h5Var, g7.e6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(context, false);
        this.d = c9Var;
        c9Var.setStyle(11);
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(c9Var, g7.e6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i9).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, g7.e6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i10 = R.drawable.msg_played;
        } else {
            i10 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        c9Var.setAlpha(0.0f);
        h5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j10 = peer.user_id;
        } else {
            j10 = 0;
        }
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getMessageReadParticipants, new gh.v(this, j10, i9, chat));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.wk0 a() {
        va1 va1Var = this.f41531s;
        if (va1Var != null) {
            return va1Var;
        }
        va1 va1Var2 = new va1(getContext(), 10, null);
        this.f41531s = va1Var2;
        getContext();
        va1Var2.setLayoutManager(new f2.m0());
        this.f41531s.i(new bg.p2(this, 6));
        this.f41531s.setAdapter(new gh.t3(this, 4));
        return this.f41531s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.c9 c9Var;
        String str;
        ArrayList arrayList = this.f41526c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i9 = 0;
        while (true) {
            c9Var = this.d;
            if (i9 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f41528f;
            if (i9 < size) {
                c9Var.b(i9, (TLObject) arrayList.get(i9), i10);
            } else {
                c9Var.b(i9, null, i10);
            }
            i9++;
        }
        if (arrayList.size() == 1) {
            c9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            c9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            c9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.h5 h5Var = this.f41527e;
        h5Var.setRightPadding(dp);
        c9Var.a(false);
        ArrayList arrayList2 = this.f41524a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            h5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            h5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            h5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        h5Var.animate().alpha(1.0f).setDuration(220L).start();
        c9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.e00 e00Var = this.f41529n;
        e00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.u9(e00Var)).start();
        va1 va1Var = this.f41531s;
        if (va1Var != null) {
            va1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f41530r = true;
        org.telegram.ui.Components.e00 e00Var = this.f41529n;
        if (e00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 h5Var = this.f41527e;
        h5Var.setVisibility(8);
        if (z10) {
            e00Var.setVisibility(8);
        }
        super.onMeasure(i9, i10);
        if (z10) {
            e00Var.getLayoutParams().width = getMeasuredWidth();
            e00Var.setVisibility(0);
        }
        h5Var.setVisibility(0);
        h5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f41530r = false;
        super.onMeasure(i9, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f41530r) {
            return;
        }
        super.requestLayout();
    }
}

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
public final class gi0 extends FrameLayout {
    public final ArrayList f33108a;
    public final ArrayList f33109b;
    public final ArrayList f33110c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final int f33111f;
    public final boolean h;
    public final org.telegram.ui.Components.a10 f33112n;
    public boolean f33113r;
    public ic1 f33114s;

    public gi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f33108a = new ArrayList();
        this.f33109b = new ArrayList();
        this.f33110c = new ArrayList();
        this.f33111f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.f33112n = a10Var;
        a10Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f18017i6, -1);
        a10Var.setViewType(13);
        a10Var.setIsSingleCell(false);
        addView(a10Var, w7.a6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(l5Var, w7.a6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.d = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(j9Var, w7.a6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.a6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        j9Var.setAlpha(0.0f);
        l5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.messenger.u0(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.vl0 a() {
        ic1 ic1Var = this.f33114s;
        if (ic1Var != null) {
            return ic1Var;
        }
        ic1 ic1Var2 = new ic1(getContext(), 9, null);
        this.f33114s = ic1Var2;
        getContext();
        ic1Var2.setLayoutManager(new s4.c0());
        this.f33114s.i(new bi.z1(this, 5));
        this.f33114s.setAdapter(new fg.n0(this, 3));
        return this.f33114s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.j9 j9Var;
        String str;
        ArrayList arrayList = this.f33110c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            j9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f33111f;
            if (i10 < size) {
                j9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                j9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            j9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            j9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            j9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        l5Var.setRightPadding(dp);
        j9Var.a(false);
        ArrayList arrayList2 = this.f33108a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            l5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            l5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            l5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        l5Var.animate().alpha(1.0f).setDuration(220L).start();
        j9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.a10 a10Var = this.f33112n;
        a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.yo(a10Var)).start();
        ic1 ic1Var = this.f33114s;
        if (ic1Var != null) {
            ic1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f33113r = true;
        org.telegram.ui.Components.a10 a10Var = this.f33112n;
        if (a10Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        l5Var.setVisibility(8);
        if (z10) {
            a10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            a10Var.getLayoutParams().width = getMeasuredWidth();
            a10Var.setVisibility(0);
        }
        l5Var.setVisibility(0);
        l5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f33113r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f33113r) {
            return;
        }
        super.requestLayout();
    }
}

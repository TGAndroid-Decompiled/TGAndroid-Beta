package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vm0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final vm0 E;
    public n0 F;
    public ja G;
    public final t1 f21469a;
    public int f21470b;
    public long f21471c;
    public MessageObject d;
    public long e;
    public StaticLayout f21473g;
    public float h;
    public float f21474i;
    public int f21475j;
    public float f21480o;
    public float f21481p;
    public i90 f21484s;
    public final org.telegram.ui.Components.z5 f21486u;
    public k01 v;
    public final rc f21489y;
    public final TextPaint f21472f = new TextPaint(1);
    public final Paint f21476k = new Paint(1);
    public final Path f21477l = new Path();
    public final float f21478m = -1.0f;
    public int f21479n = AndroidUtilities.dp(66.0f);
    public final ArrayList f21482q = new ArrayList();
    public final Path f21483r = new Path();
    public final RectF f21487w = new RectF();
    public final RectF f21488x = new RectF();
    public final Paint f21490z = new Paint(1);
    public boolean f21485t = true;

    public o0(t1 t1Var) {
        this.f21469a = t1Var;
        this.E = new vm0(t1Var.getContext(), null);
        this.f21489y = new rc(t1Var);
        this.f21486u = new org.telegram.ui.Components.z5(t1Var, 350L, nr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        vm0 vm0Var = this.E;
        if (vm0Var.b()) {
            float f10 = vm0Var.f29529j;
            this.f21480o = f10;
            this.f21480o = Utilities.clamp(f10, this.f21481p - (this.f21487w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f21469a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f21482q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f21470b = messageObject.currentAccount;
        this.d = messageObject;
        this.f21471c = messageObject.getDialogId();
        MessagesController.getInstance(this.f21470b).getChat(Long.valueOf(-this.f21471c));
        this.e = -this.f21471c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f21472f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.j6.ic;
        t1 t1Var = this.f21469a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, t1Var.Fd));
        this.f21473g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f21474i = 0.0f;
        for (int i14 = 0; i14 < this.f21473g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f21473g.getLineLeft(i14));
            this.f21474i = Math.max(this.f21474i, this.f21473g.getLineRight(i14));
        }
        this.f21475j = this.f21473g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f21490z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, t1Var.Fd));
        t1Var.f22182p0 = AndroidUtilities.dp(14.66f) + this.f21475j;
        int i15 = 0;
        while (true) {
            arrayList = this.f21482q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f21416c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f21470b).getChannelRecommendations(this.f21471c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i17);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f21470b).isPremium() || arrayList2.size() != 1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f21485t = z4;
        if (!z4) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f21470b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f21470b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f21470b, t1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i11);
                }
                arrayList.add(new n0(this.f21470b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f21471c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            k01 k01Var = new k01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            k01Var.f26093o = true;
            this.v = k01Var;
        }
        if (d()) {
            t1Var.f22182p0 = AndroidUtilities.dp(144.0f) + t1Var.f22182p0;
            this.f21476k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20162ra, t1Var.Fd));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f21479n);
        this.f21481p = size2;
        this.f21480o = Utilities.clamp(this.f21480o, size2, 0.0f);
    }
}

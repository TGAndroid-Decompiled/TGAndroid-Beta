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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final nm0 E;
    public n0 F;
    public na G;
    public final t1 f22380a;
    public int f22381b;
    public long f22382c;
    public MessageObject d;
    public long f22383e;
    public StaticLayout f22385g;
    public float h;
    public float f22386i;
    public int f22387j;
    public float f22392o;
    public float f22393p;
    public h90 f22396s;
    public final org.telegram.ui.Components.e6 f22398u;
    public f01 v;
    public final zc f22401y;
    public final TextPaint f22384f = new TextPaint(1);
    public final Paint f22388k = new Paint(1);
    public final Path f22389l = new Path();
    public final float f22390m = -1.0f;
    public int f22391n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22394q = new ArrayList();
    public final Path f22395r = new Path();
    public final RectF f22399w = new RectF();
    public final RectF f22400x = new RectF();
    public final Paint f22402z = new Paint(1);
    public boolean f22397t = true;

    public o0(t1 t1Var) {
        this.f22380a = t1Var;
        this.E = new nm0(t1Var.getContext(), null);
        this.f22401y = new zc(t1Var);
        this.f22398u = new org.telegram.ui.Components.e6(t1Var, 350L, pr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        nm0 nm0Var = this.E;
        if (nm0Var.b()) {
            float f7 = nm0Var.f28825j;
            this.f22392o = f7;
            this.f22392o = Utilities.clamp(f7, this.f22393p - (this.f22399w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22380a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22394q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f22381b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22382c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22381b).getChat(Long.valueOf(-this.f22382c));
        this.f22383e = -this.f22382c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22384f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.j6.f20759ic;
        t1 t1Var = this.f22380a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i13, t1Var.Id));
        this.f22385g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22386i = 0.0f;
        for (int i14 = 0; i14 < this.f22385g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22385g.getLineLeft(i14));
            this.f22386i = Math.max(this.f22386i, this.f22385g.getLineRight(i14));
        }
        this.f22387j = this.f22385g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22402z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, t1Var.Id));
        t1Var.f23110s0 = AndroidUtilities.dp(14.66f) + this.f22387j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22394q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22317c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22381b).getChannelRecommendations(this.f22382c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22381b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22397t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22381b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22381b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22381b, t1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22381b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22382c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            f01 f01Var = new f01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            f01Var.f25857o = true;
            this.v = f01Var;
        }
        if (d()) {
            t1Var.f23110s0 = AndroidUtilities.dp(144.0f) + t1Var.f23110s0;
            this.f22388k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20920ra, t1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22391n);
        this.f22393p = size2;
        this.f22392o = Utilities.clamp(this.f22392o, size2, 0.0f);
    }
}

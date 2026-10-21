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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final mn0 E;
    public n0 F;
    public ka G;
    public final u1 f22674a;
    public int f22675b;
    public long f22676c;
    public MessageObject d;
    public long e;
    public StaticLayout f22678g;
    public float h;
    public float f22679i;
    public int f22680j;
    public float f22685o;
    public float f22686p;
    public ba0 f22689s;
    public final org.telegram.ui.Components.f6 f22691u;
    public f11 v;
    public final yc f22694y;
    public final TextPaint f22677f = new TextPaint(1);
    public final Paint f22681k = new Paint(1);
    public final Path f22682l = new Path();
    public final float f22683m = -1.0f;
    public int f22684n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22687q = new ArrayList();
    public final Path f22688r = new Path();
    public final RectF f22692w = new RectF();
    public final RectF f22693x = new RectF();
    public final Paint f22695z = new Paint(1);
    public boolean f22690t = true;

    public o0(u1 u1Var) {
        this.f22674a = u1Var;
        this.E = new mn0(u1Var.getContext(), null);
        this.f22694y = new yc(u1Var);
        this.f22691u = new org.telegram.ui.Components.f6(u1Var, 350L, bs.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        mn0 mn0Var = this.E;
        if (mn0Var.b()) {
            float f7 = mn0Var.f28565j;
            this.f22685o = f7;
            this.f22685o = Utilities.clamp(f7, this.f22686p - (this.f22692w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22674a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22687q.size() > 0) {
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
        this.f22675b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22676c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22675b).getChat(Long.valueOf(-this.f22676c));
        this.e = -this.f22676c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22677f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f21084ic;
        u1 u1Var = this.f22674a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i13, u1Var.Id));
        this.f22678g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22679i = 0.0f;
        for (int i14 = 0; i14 < this.f22678g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22678g.getLineLeft(i14));
            this.f22679i = Math.max(this.f22679i, this.f22678g.getLineRight(i14));
        }
        this.f22680j = this.f22678g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22695z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f23472s0 = AndroidUtilities.dp(14.66f) + this.f22680j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22687q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22626c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22675b).getChannelRecommendations(this.f22676c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22675b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22690t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22675b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22675b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22675b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22675b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22676c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            f11 f11Var = new f11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            f11Var.f26030o = true;
            this.v = f11Var;
        }
        if (d()) {
            u1Var.f23472s0 = AndroidUtilities.dp(144.0f) + u1Var.f23472s0;
            this.f22681k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21251ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22684n);
        this.f22686p = size2;
        this.f22685o = Utilities.clamp(this.f22685o, size2, 0.0f);
    }
}

package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class do0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.r2 G;
    public boolean H;
    public org.telegram.ui.i10 I;
    public final org.telegram.ui.b10 J;
    public String K;
    public String L;
    public wn0 M;
    public final rl0 N;
    public boolean O;
    public boolean P;
    public final fy0 f27500a;
    public final bi.r1 f27501b;
    public final co0 f27502c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f27503f;
    public final ArrayList h;
    public final ArrayList f27504n;
    public int f27505r;
    public int f27506s;
    public int v;
    public int f27507w;
    public int f27508x;
    public int f27509y;

    public do0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        super(r2Var.getParentActivity());
        co0 co0Var = new co0(this);
        this.f27502c = co0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f27503f = new ArrayList();
        this.h = new ArrayList();
        this.f27504n = new ArrayList();
        this.f27506s = -1;
        this.v = -1;
        this.f27507w = -1;
        this.f27508x = -1;
        this.f27509y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.b10(0, 0L);
        this.G = r2Var;
        this.F = r2Var.getParentActivity();
        this.d = i10;
        bi.r1 r1Var = new bi.r1(this, getContext(), 20);
        this.f27501b = r1Var;
        new s4.z(new ei.f(this, 3)).h(r1Var);
        addView(r1Var);
        r2Var.getParentActivity();
        r1Var.setLayoutManager(new ig.a0(10));
        r1Var.setAdapter(co0Var);
        r1Var.setOnScrollListener(new ml(this, 12));
        s4.l lVar = new s4.l();
        lVar.C = false;
        lVar.f47798m = false;
        r1Var.setItemAnimator(lVar);
        r1Var.setOnItemClickListener(new xn0(this, i10, 0));
        r1Var.setOnItemLongClickListener(new tv(this, 19));
        this.N = new rl0(r1Var, true);
        c10 c10Var = new c10(getContext(), null);
        addView(c10Var);
        c10Var.setUseHeaderOffset(true);
        c10Var.setViewType(3);
        c10Var.setVisibility(8);
        fy0 fy0Var = new fy0(getContext(), c10Var, 1, null);
        this.f27500a = fy0Var;
        addView(fy0Var);
        r1Var.setEmptyView(fy0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.r1 r1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (r1Var = this.f27501b) != null) {
            for (int i11 = 0; i11 < r1Var.getChildCount(); i11++) {
                try {
                    View childAt = r1Var.getChildAt(i11);
                    if ((childAt instanceof zn0) && (message = ((zn0) childAt).f35404a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        bi.r1 r1Var = this.f27501b;
        if (z10) {
            r1Var.t1(0, i10, 0, i11);
        } else {
            r1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.r2 r2Var = this.G;
        if (r2Var != null && this.f27501b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z10) {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!r2Var.hasStoryViewer()) {
                        wc b02 = wc.b0(r2Var);
                        int i13 = R.raw.speed_limit;
                        if (z10) {
                            i10 = R.string.UploadSpeedLimited;
                        } else {
                            i10 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i10);
                        if (z10) {
                            i11 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i11 = R.string.DownloadSpeedLimitedMessage;
                        }
                        qc M = b02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new d60(2, this, z10)), spannableString), i13);
                        M.f31861j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        co0 co0Var = this.f27502c;
        co0Var.q(0, co0Var.f27219c.f27505r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f27500a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                wn0 wn0Var = new wn0(this, arrayList, lowerCase, arrayList2);
                this.M = wn0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue2.postRunnable(wn0Var, j10);
                this.f27504n.clear();
                this.h.clear();
                if (!equals) {
                    this.f27500a.e(true, true);
                    e(this.h, this.f27504n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f27505r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f27504n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f27504n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f27503f.size(); i12++) {
            ((MessageObject) this.f27503f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f27504n, z10);
        if (this.f27505r == 0) {
            this.f27500a.e(false, false);
            this.f27500a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f27500a.e.setVisibility(8);
        }
        this.f27500a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.e1 T;
        co0 co0Var = this.f27502c;
        if (z10) {
            int i10 = this.f27506s;
            int i11 = this.v;
            int i12 = this.f27507w;
            int i13 = this.f27508x;
            int i14 = this.f27509y;
            int i15 = this.E;
            int i16 = this.f27505r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f27503f);
            f(arrayList, arrayList2);
            s4.p.c(new yn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(co0Var);
            int i17 = 0;
            while (true) {
                bi.r1 r1Var = this.f27501b;
                if (i17 < r1Var.getChildCount()) {
                    View childAt = r1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = r1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.z3) {
                            co0Var.v(T, R);
                        } else if (childAt instanceof zn0) {
                            org.telegram.ui.Cells.o7 o7Var = ((zn0) childAt).f35404a;
                            o7Var.f(true);
                            int id2 = o7Var.getMessage().getId();
                            long dialogId = o7Var.getMessage().getDialogId();
                            org.telegram.ui.b10 b10Var = this.J;
                            b10Var.f37862a = dialogId;
                            b10Var.f37863b = id2;
                            o7Var.b(this.I.c(b10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            co0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f27503f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f27505r = 0;
        this.f27506s = -1;
        this.v = -1;
        this.f27507w = -1;
        this.f27508x = -1;
        this.f27509y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f27505r;
            int i14 = i13 + 1;
            this.f27505r = i14;
            this.f27506s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f27505r = size3;
            this.f27507w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f27505r;
            int i16 = i15 + 1;
            this.f27505r = i16;
            this.f27508x = i15;
            this.f27509y = i16;
            int size4 = arrayList4.size() + i16;
            this.f27505r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addWeakObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addWeakObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.O) {
            this.O = true;
            Utilities.searchQueue.postRunnable(new xa0(this, 23));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.i10 i10Var) {
        this.I = i10Var;
    }
}

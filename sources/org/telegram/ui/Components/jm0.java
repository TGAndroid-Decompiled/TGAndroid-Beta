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
import org.telegram.messenger.DispatchQueue;
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

public final class jm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final Activity B;
    public final org.telegram.ui.ActionBar.n2 C;
    public boolean D;
    public org.telegram.ui.h10 E;
    public final org.telegram.ui.a10 F;
    public String G;
    public String H;
    public cm0 I;
    public final gk0 J;
    public boolean K;
    public boolean L;

    public final iw0 f29727a;

    public final hh.f1 f29728b;

    public final im0 f29729c;
    public final int d;

    public final ArrayList f29730e;

    public final ArrayList f29731f;
    public final ArrayList h;

    public final ArrayList f29732n;

    public int f29733r;

    public int f29734s;
    public int v;

    public int f29735w;

    public int f29736x;

    public int f29737y;

    public jm0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        im0 im0Var = new im0(this);
        this.f29729c = im0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f29730e = arrayList;
        this.f29731f = new ArrayList();
        this.h = new ArrayList();
        this.f29732n = new ArrayList();
        this.f29734s = -1;
        this.v = -1;
        this.f29735w = -1;
        this.f29736x = -1;
        this.f29737y = -1;
        this.A = -1;
        this.F = new org.telegram.ui.a10(0, 0L);
        this.C = n2Var;
        this.B = n2Var.getParentActivity();
        this.d = i10;
        hh.f1 f1Var = new hh.f1(this, getContext(), 19);
        this.f29728b = f1Var;
        new f2.f0(new kh.g(this, 3)).d(f1Var);
        addView(f1Var);
        n2Var.getParentActivity();
        f1Var.setLayoutManager(new org.telegram.ui.j(8));
        f1Var.setAdapter(im0Var);
        f1Var.setOnScrollListener(new xm(this, 11));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5819m = false;
        f1Var.setItemAnimator(lVar);
        f1Var.setOnItemClickListener(new dm0(this, i10, 0));
        f1Var.setOnItemLongClickListener(new vu(this, 16));
        this.J = new gk0(f1Var, true);
        h00 h00Var = new h00(getContext(), null);
        addView(h00Var);
        h00Var.setUseHeaderOffset(true);
        h00Var.setViewType(3);
        h00Var.setVisibility(8);
        iw0 iw0Var = new iw0(getContext(), h00Var, 1, null);
        this.f29727a = iw0Var;
        addView(iw0Var);
        f1Var.setEmptyView(iw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        hh.f1 f1Var;
        MessageObject message;
        int i10 = this.d;
        if (UserConfig.getInstance(i10).isPremium() || (f1Var = this.f29728b) == null) {
            return;
        }
        for (int i11 = 0; i11 < f1Var.getChildCount(); i11++) {
            try {
                View childAt = f1Var.getChildAt(i11);
                if ((childAt instanceof fm0) && (message = ((fm0) childAt).f28409a.getMessage()) != null) {
                    if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(false);
                        return;
                    } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                        c(true);
                        return;
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.L = z10;
        setPadding(0, i10, 0, i11);
        hh.f1 f1Var = this.f29728b;
        if (z10) {
            f1Var.o1(0, i10, 0, i11);
        } else {
            f1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.L = false;
    }

    public final void c(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.C;
        if (n2Var == null || !this.f29728b.C) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown;
        int i10 = this.d;
        if (j10 < ((long) MessagesController.getInstance(i10).uploadPremiumSpeedupNotifyPeriod) * 1000) {
            return;
        }
        ConnectionsManager.lastPremiumFloodWaitShown = jCurrentTimeMillis;
        if (UserConfig.getInstance(i10).isPremium() || MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            return;
        }
        SpannableString spannableString = new SpannableString(Double.toString(((double) Math.round((z10 ? MessagesController.getInstance(i10).uploadPremiumSpeedupUpload : MessagesController.getInstance(i10).uploadPremiumSpeedupDownload) * 10.0f)) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (n2Var.hasStoryViewer()) {
            return;
        }
        ec ecVarM = mc.a0(n2Var).M(LocaleController.getString(z10 ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new f50(2, this, z10)), spannableString), R.raw.speed_limit);
        ecVarM.f28020j = 8000;
        ecVarM.k(false);
    }

    public final void d(boolean z10) {
        im0 im0Var = this.f29729c;
        im0Var.q(0, im0Var.f29408c.f29733r);
        if (!TextUtils.isEmpty(this.G)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f29727a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.G.toLowerCase();
                boolean zEquals = lowerCase.equals(this.H);
                this.H = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.I);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                cm0 cm0Var = new cm0(this, arrayList, lowerCase, arrayList2);
                this.I = cm0Var;
                dispatchQueue.postRunnable(cm0Var, zEquals ? 0L : 300L);
                this.f29732n.clear();
                this.h.clear();
                if (zEquals) {
                    return;
                }
                this.f29727a.e(true, true);
                e(this.h, this.f29732n, z10);
                return;
            }
        }
        if (this.f29733r == 0) {
            this.J.b(0);
        }
        if (this.K) {
            this.h.clear();
            this.f29732n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f29732n);
        for (int i11 = 0; i11 < this.f29730e.size(); i11++) {
            ((MessageObject) this.f29730e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f29731f.size(); i12++) {
            ((MessageObject) this.f29731f.get(i12)).setQuery(null);
        }
        this.H = null;
        e(this.h, this.f29732n, z10);
        if (this.f29733r == 0) {
            this.f29727a.e(false, false);
            this.f29727a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f29727a.f29506e.setVisibility(8);
        }
        this.f29727a.setStickerType(9);
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
        f2.o1 o1VarT;
        im0 im0Var = this.f29729c;
        if (!z10) {
            f(arrayList, arrayList2);
            im0Var.l();
            return;
        }
        int i10 = this.f29734s;
        int i11 = this.v;
        int i12 = this.f29735w;
        int i13 = this.f29736x;
        int i14 = this.f29737y;
        int i15 = this.A;
        int i16 = this.f29733r;
        ArrayList arrayList3 = new ArrayList(this.f29730e);
        ArrayList arrayList4 = new ArrayList(this.f29731f);
        f(arrayList, arrayList2);
        f2.q.c(new em0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(im0Var);
        int i17 = 0;
        while (true) {
            hh.f1 f1Var = this.f29728b;
            if (i17 >= f1Var.getChildCount()) {
                return;
            }
            View childAt = f1Var.getChildAt(i17);
            int iR = RecyclerView.R(childAt);
            if (iR >= 0 && (o1VarT = f1Var.T(childAt)) != null && !o1VarT.r()) {
                if (childAt instanceof org.telegram.ui.Cells.s3) {
                    im0Var.v(o1VarT, iR);
                } else if (childAt instanceof fm0) {
                    org.telegram.ui.Cells.f7 f7Var = ((fm0) childAt).f28409a;
                    f7Var.f(true);
                    int id2 = f7Var.getMessage().getId();
                    long dialogId = f7Var.getMessage().getDialogId();
                    org.telegram.ui.a10 a10Var = this.F;
                    a10Var.f36332a = dialogId;
                    a10Var.f36333b = id2;
                    f7Var.b(this.E.b(a10Var), true);
                }
            }
            i17++;
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f29730e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f29731f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f29733r = 0;
        this.f29734s = -1;
        this.v = -1;
        this.f29735w = -1;
        this.f29736x = -1;
        this.f29737y = -1;
        this.A = -1;
        this.D = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f29733r;
            int i13 = i12 + 1;
            this.f29733r = i13;
            this.f29734s = i12;
            this.v = i13;
            int size3 = arrayList3.size() + i13;
            this.f29733r = size3;
            this.f29735w = size3;
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i14)).getFileName())) {
                    this.D = true;
                    break;
                }
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        int i15 = this.f29733r;
        int i16 = i15 + 1;
        this.f29733r = i16;
        this.f29736x = i15;
        this.f29737y = i16;
        int size4 = arrayList4.size() + i16;
        this.f29733r = size4;
        this.A = size4;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.K) {
            this.K = true;
            Utilities.searchQueue.postRunnable(new mb0(this, 20));
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
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.h10 h10Var) {
        this.E = h10Var;
    }
}

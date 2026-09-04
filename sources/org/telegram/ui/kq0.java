package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class kq0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final co F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.n1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.f1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.hu M;
    public j0 N;
    public ImageView O;
    public fq0 P;
    public t50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public jq0 V;
    public CharSequence f38104a;
    public final HashMap f38105b;
    public final ArrayList f38106c;
    public ArrayList d;
    public boolean f38107e;
    public int f38108f;
    public org.telegram.ui.Components.ll0 h;
    public iq0 f38109n;
    public FrameLayout f38110r;
    public TextView f38111s;
    public boolean v;
    public final int f38112w;
    public boolean f38113x;
    public final boolean f38114y;

    public kq0(int i10, boolean z10, boolean z11, co coVar) {
        super(null);
        this.f38105b = new HashMap();
        this.f38106c = new ArrayList();
        this.d = null;
        this.f38107e = false;
        this.f38108f = 2;
        this.f38113x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = coVar;
        this.f38112w = i10;
        this.f38114y = z10;
        this.E = z11;
    }

    public static void U(kq0 kq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            br0 br0Var = new br0(0, albumEntry, kq0Var.f38105b, kq0Var.f38106c, kq0Var.f38112w, kq0Var.E, kq0Var.F, false);
            Editable text = kq0Var.M.getText();
            kq0Var.f38104a = text;
            br0Var.d = text;
            org.telegram.ui.Components.hu huVar = br0Var.f34887d0;
            if (huVar != null) {
                huVar.setText(text);
            }
            br0Var.f34906s0 = new gq0(kq0Var);
            br0Var.f0(kq0Var.G, kq0Var.H);
            kq0Var.presentFragment(br0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (kq0Var.f38114y) {
            gr0 gr0Var = new gr0(hashMap, arrayList, kq0Var.f38112w, kq0Var.E, kq0Var.F);
            Editable text2 = kq0Var.M.getText();
            kq0Var.f38104a = text2;
            br0 br0Var2 = gr0Var.f36752a;
            if (br0Var2 != null) {
                br0Var2.d = text2;
                org.telegram.ui.Components.hu huVar2 = br0Var2.f34887d0;
                if (huVar2 != null) {
                    huVar2.setText(text2);
                }
            }
            hq0 hq0Var = new hq0(kq0Var, hashMap, arrayList);
            br0 br0Var3 = gr0Var.f36752a;
            br0Var3.f34906s0 = hq0Var;
            br0 br0Var4 = gr0Var.f36753b;
            br0Var4.f34906s0 = hq0Var;
            br0Var3.f34907t0 = new fr0(gr0Var, 0);
            br0Var4.f34907t0 = new fr0(gr0Var, 1);
            int i10 = kq0Var.G;
            boolean z10 = kq0Var.H;
            br0Var3.f0(i10, z10);
            gr0Var.f36753b.f0(i10, z10);
            kq0Var.presentFragment(gr0Var);
            return;
        }
        br0 br0Var5 = new br0(0, albumEntry, hashMap, arrayList, kq0Var.f38112w, kq0Var.E, kq0Var.F, false);
        Editable text3 = kq0Var.M.getText();
        kq0Var.f38104a = text3;
        br0Var5.d = text3;
        org.telegram.ui.Components.hu huVar3 = br0Var5.f34887d0;
        if (huVar3 != null) {
            huVar3.setText(text3);
        }
        br0Var5.f34906s0 = new dq0(kq0Var, hashMap, arrayList);
        br0Var5.f0(kq0Var.G, kq0Var.H);
        kq0Var.presentFragment(br0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.V.a(arrayList2);
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        j0 j0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        j0Var.setScaleX(f7);
        j0 j0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        j0Var2.setScaleY(f10);
        j0 j0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        j0Var3.setAlpha(f11);
        t50 t50Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        t50Var.setScaleX(f12);
        t50 t50Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        t50Var2.setScaleY(f13);
        t50 t50Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        t50Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.R;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new eq0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.f38113x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        fq0 fq0Var = new fq0(this, context);
        this.P = fq0Var;
        fq0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.h = ll0Var;
        ll0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var2 = this.h;
        iq0 iq0Var = new iq0(this, context);
        this.f38109n = iq0Var;
        ll0Var2.setAdapter(iq0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f38111s = textView;
        textView.setTextColor(-8355712);
        this.f38111s.setTextSize(1, 20.0f);
        this.f38111s.setGravity(17);
        this.f38111s.setVisibility(8);
        this.f38111s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f38111s, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f38111s.setOnTouchListener(new ci.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38110r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f38110r, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f38110r.addView(radialProgressView, w7.x5.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.x5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.x5.e(-1, 48, 83));
        this.L.setOnTouchListener(new ci.d(2));
        org.telegram.ui.Components.hu huVar = this.M;
        if (huVar != null) {
            huVar.o();
        }
        this.M = new org.telegram.ui.Components.hu(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.zt editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f38104a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        j0 j0Var = new j0(this, context, 16);
        this.N = j0Var;
        j0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bi.z1(17));
        this.N.addView(this.O, w7.x5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new l60(this, 17));
        this.O.setOnLongClickListener(new u(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        t50 t50Var = new t50(this, context, 2);
        this.Q = t50Var;
        t50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f38112w != 0) {
            this.M.setVisibility(8);
        }
        if (this.f38107e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f38110r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f38110r.setVisibility(8);
            this.h.setEmptyView(this.f38111s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f38112w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f38113x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f38110r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.ll0 ll0Var = this.h;
                if (ll0Var != null && ll0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f38111s);
                }
                iq0 iq0Var = this.f38109n;
                if (iq0Var != null) {
                    iq0Var.l();
                }
                this.f38107e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f20667da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.hu huVar = this.M;
        if (huVar != null && huVar.f26850e) {
            if (z10) {
                huVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ll0 ll0Var = this.h;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f38112w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f38113x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f38107e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.hu huVar = this.M;
        if (huVar != null) {
            huVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        iq0 iq0Var = this.f38109n;
        if (iq0Var != null) {
            iq0Var.l();
        }
        org.telegram.ui.Components.hu huVar = this.M;
        if (huVar != null) {
            huVar.s();
        }
        org.telegram.ui.Components.ll0 ll0Var = this.h;
        if (ll0Var != null) {
            ll0Var.getViewTreeObserver().addOnPreDrawListener(new ei(this, 3));
        }
    }
}

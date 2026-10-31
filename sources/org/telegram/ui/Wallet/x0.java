package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.pe1;
public final class x0 implements Runnable {
    public final int f35375a;
    public final int f35376b;
    public final Object f35377c;
    public final Object d;

    public x0(int i10, q20 q20Var, k0 k0Var) {
        this.f35375a = 1;
        this.f35376b = i10;
        this.f35377c = q20Var;
        this.d = k0Var;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        org.telegram.utils.twidget.w wVar;
        org.telegram.ui.ActionBar.k2 k2Var;
        boolean z11;
        boolean z12 = false;
        int i11 = 0;
        String str = null;
        boolean z13 = true;
        switch (this.f35375a) {
            case 0:
                int i12 = this.f35376b;
                z0 z0Var = ((y0) this.f35377c).f35403c;
                if (z0Var.c((lc.v) this.d, i12)) {
                    z0Var.f("invalid streaming JSON");
                    return;
                }
                return;
            case 1:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.f35376b);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new a3.b(1), new j((q20) this.f35377c, (k0) this.d, connectionsManager));
                return;
            case 2:
                Context context = (Context) this.f35377c;
                int i13 = this.f35376b;
                String str2 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = vp.r1(i13).I6;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder i14 = sc.e.i(str3, "transaction/");
                    i14.append(Uri.encode(str2));
                    gf.f.t(context, i14.toString());
                    return;
                }
                return;
            case 3:
                c6 c6Var = (c6) this.f35377c;
                int i15 = this.f35376b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (c6Var.f34334f0 == i15) {
                    c6Var.f(bitmapArr);
                    c6Var.f34325a.run();
                    return;
                }
                return;
            case 4:
                int i16 = this.f35376b;
                ra raVar = (ra) this.d;
                int i17 = i16 + 1;
                ArrayList arrayList = ((k8) this.f35377c).f34823w;
                if (i17 < arrayList.size()) {
                    ((ra) arrayList.get(i17)).f35154a.requestFocus();
                    return;
                } else {
                    org.telegram.messenger.i0.v1(raVar);
                    return;
                }
            case 5:
                int i18 = this.f35376b;
                ra raVar2 = (ra) this.d;
                int i19 = i18 + 1;
                ArrayList arrayList2 = ((ja) this.f35377c).d;
                if (i19 < arrayList2.size()) {
                    ((ra) arrayList2.get(i19)).f35154a.requestFocus();
                    return;
                } else {
                    org.telegram.messenger.i0.v1(raVar2);
                    return;
                }
            case 6:
                pe1 pe1Var = (pe1) this.f35377c;
                int i20 = this.f35376b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = pe1Var.e;
                WallpapersListActivity wallpapersListActivity = pe1Var.E;
                ArrayList arrayList3 = pe1Var.d;
                if (i20 == pe1Var.f40656w) {
                    pe1Var.f40655s = 0;
                    int size = arrayList3.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        pe1Var.f40654r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i21);
                            if (!"photo".equals(botInlineResult.type) || hashMap.containsKey(botInlineResult.f19791id)) {
                                z10 = z13;
                            } else {
                                ?? obj = new Object();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                                    z10 = z13;
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(botInlineResult.photo.sizes, 320, false, null, false);
                                    if (w9 != null) {
                                        obj.E = w9.f19818w;
                                        obj.F = w9.h;
                                        obj.L = w9;
                                        obj.K = botInlineResult.photo;
                                        obj.G = w9.size;
                                        obj.M = w10;
                                        obj.B = botInlineResult.f19791id;
                                        obj.H = 0;
                                        arrayList3.add(obj);
                                        hashMap.put(obj.B, obj);
                                    }
                                } else {
                                    z10 = z13;
                                    if (botInlineResult.content != null) {
                                        int i22 = 0;
                                        while (true) {
                                            if (i22 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i22);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    obj.E = documentAttribute.f19800w;
                                                    obj.F = documentAttribute.h;
                                                } else {
                                                    i22++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            obj.D = webDocument.url;
                                        } else {
                                            obj.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        obj.C = webDocument2.url;
                                        obj.G = webDocument2.size;
                                        obj.B = botInlineResult.f19791id;
                                        obj.H = 0;
                                        arrayList3.add(obj);
                                        hashMap.put(obj.B, obj);
                                    }
                                }
                            }
                            i21++;
                            z13 = z10;
                        }
                        boolean z14 = z13;
                        if (size == arrayList3.size() || pe1Var.f40654r == null) {
                            z12 = z14;
                        }
                        pe1Var.f40652f = z12;
                    }
                    if (size != arrayList3.size()) {
                        int i23 = size % wallpapersListActivity.N;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / i10);
                        if (i23 != 0) {
                            pe1Var.g(((int) Math.ceil(f7 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.o(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    return;
                }
                return;
            case 7:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) this.f35377c;
                int i24 = this.f35376b;
                String str4 = (String) this.d;
                if (!k0Var.f44385u && (wVar = k0Var.J) != null) {
                    if (i24 == 13) {
                        if (wVar.e != null && !TextUtils.isEmpty(str4)) {
                            org.telegram.messenger.i0.g(str4);
                            if (org.telegram.messenger.i0.H3()) {
                                k2Var = LaunchActivity.T();
                            } else {
                                k2Var = null;
                            }
                            if (k2Var != null) {
                                if (str4.length() > 80) {
                                    str4 = str4.substring(0, 80) + "…";
                                }
                                cc.a0(k2Var).Q(2131623993, 36, cd.a0(null, null, 2131742891, str4)).j();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i24 == 14) {
                        boolean equals = "1".equals(str4);
                        if (wVar.A != equals) {
                            wVar.A = equals;
                            t7.u uVar = wVar.e;
                            if (uVar != null) {
                                uVar.getClass();
                                org.telegram.utils.twidget.p.C();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(str4);
                            if (i24 == 19) {
                                k0Var.J.i(jSONObject.getLong("id"), jSONObject.getJSONObject("call"));
                                return;
                            }
                            org.telegram.utils.twidget.w wVar2 = k0Var.J;
                            long j10 = jSONObject.getLong("id");
                            String string = jSONObject.getString("data");
                            boolean optBoolean = jSONObject.optBoolean("wallet");
                            t7.u uVar2 = wVar2.e;
                            if (uVar2 != null) {
                                uVar2.getClass();
                                org.telegram.utils.twidget.m h = org.telegram.utils.twidget.p.h(wVar2);
                                if (h != null && h.f44400i && (!optBoolean || org.telegram.utils.twidget.p.D(h))) {
                                    TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                                    tL_widgetQueryTypeData.with_wallet = optBoolean;
                                    org.telegram.utils.twidget.p.u(h, wVar2, j10, tL_widgetQueryTypeData, string.getBytes(StandardCharsets.UTF_8));
                                    return;
                                }
                                wVar2.a(3, null, j10);
                                return;
                            }
                            wVar2.a(3, null, j10);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                return;
            case 8:
                vq0 vq0Var = (vq0) this.f35377c;
                int i25 = this.f35376b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                rh.u5 u5Var = vq0Var.e;
                if (i25 != -1) {
                    int i26 = tL_starGiftCollection.collection_id;
                    int i27 = u5Var.f47545a;
                    int f10 = u5Var.f(i26);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) u5Var.e.remove(f10);
                        u5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = vp.r1(i27).i1(u5Var.f47546b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i27).sendRequest(deletestargiftcollection, null);
                    }
                    vq0Var.f(true);
                    v71 v71Var = vq0Var.f45132n;
                    if (i25 < u5Var.d().size()) {
                        i25++;
                    }
                    v71Var.d(-1, i25);
                    vq0Var.o();
                    return;
                }
                return;
            case 9:
                qh.y.p((org.telegram.ui.ActionBar.k2) this.f35377c, this.f35376b + 1, (qh.w) this.d);
                return;
            case 10:
                ((r4.c) ((p4.t0) this.f35377c).f44812c).r(this.f35376b, this.d);
                return;
            case 11:
                rh.a3 a3Var = (rh.a3) this.f35377c;
                int i28 = this.f35376b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = a3Var.V;
                rh.w2 w2Var = a3Var.f46615f;
                rh.u2 u2Var = a3Var.h;
                if (starGift != null) {
                    rh.y2 y2Var = new rh.y2(a3Var.getContext());
                    y2Var.a(starGift, false);
                    y2Var.setRotation(180.0f);
                    u2Var.f(i28, y2Var);
                    y2Var.setScaleX(0.5f);
                    y2Var.setScaleY(0.5f);
                    y2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = y2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    gr grVar = gr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(grVar);
                    interpolator.setUpdateListener(new qh.e0(a3Var, 2));
                    interpolator.start();
                    u2Var.f47527a[i28].setVisibility(8);
                    w2Var.setVisibility(0);
                    w2Var.setAlpha(0.0f);
                    w2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(grVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(a3Var.getContext());
                ?? imageView = new ImageView(a3Var.getContext());
                imageView.f(2131624033, 32, 32, null);
                frameLayout.addView((View) imageView, w7.b6.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                a3Var.f46622l0 = imageView;
                frameLayout.setBackground(new rh.o3(org.telegram.messenger.i0.L(12.0f), org.telegram.ui.ActionBar.t6.r1(0.075f, -1)));
                u2Var.f47527a[i28].setVisibility(8);
                frameLayout.setRotation(180.0f);
                u2Var.f(i28, frameLayout);
                a3Var.F.a(iArr[2], iArr[3]);
                rh.z2 z2Var = a3Var.f46609b;
                int[] iArr2 = a3Var.U;
                z2Var.a(iArr2[2], iArr2[3]);
                w2Var.a(iArr[3], iArr[2]);
                return;
            case 12:
                ((l20) this.d).a(cd.a0(null, null, 2131750055, xh.i.I0(this.f35376b)), (rh.r3) this.f35377c, Boolean.FALSE);
                return;
            case 13:
                rh.e6 e6Var = (rh.e6) this.f35377c;
                int i29 = this.f35376b;
                TLObject tLObject2 = (TLObject) this.d;
                boolean[] zArr = e6Var.f46863r;
                ArrayList[] arrayListArr = e6Var.f46862q;
                int i30 = e6Var.f46849a;
                e6Var.f46865t[i29] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    vp.r1(i30).V3(starsStatus.users, false);
                    vp.r1(i30).P3(starsStatus.chats, false);
                    arrayListArr[i29].addAll(starsStatus.history);
                    if (arrayListArr[i29].isEmpty() && !zArr[i29]) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zArr[i29] = z11;
                    boolean[] zArr2 = e6Var.f46866u;
                    if ((starsStatus.flags & 1) != 0) {
                        z13 = false;
                    }
                    zArr2[i29] = z13;
                    String[] strArr = e6Var.f46864s;
                    if (!z13) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i29] = str;
                    e6Var.i0(starsStatus.balance);
                    zs.f(i30).k(222, new Object[0]);
                    return;
                }
                return;
            case 14:
                int i31 = this.f35376b;
                gf.f.r((Context) this.f35377c, "https://" + vp.r1(i31).U2 + "/nft/" + ((String) this.d));
                return;
            case 15:
                sg.o oVar = (sg.o) this.f35377c;
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) this.d;
                int i32 = this.f35376b;
                Editable text = oVar.h.getText();
                int spanStart = text.getSpanStart(o5Var);
                int spanEnd = text.getSpanEnd(o5Var);
                int i33 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    oVar.h.getText().delete(spanStart, spanEnd);
                    sg.l lVar = oVar.h;
                    lVar.setSelection(Math.min(i32 - i33, lVar.getText().length()));
                    return;
                }
                return;
            case 16:
                ((th.s0) this.f35377c).F.put((String) this.d, Integer.valueOf(this.f35376b));
                return;
            case 17:
                TLObject tLObject3 = (TLObject) this.f35377c;
                int i34 = this.f35376b;
                bi.i6 i6Var = (bi.i6) this.d;
                if (tLObject3 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList4 = ((TL_stories.TL_albums) tLObject3).albums;
                    int size3 = arrayList4.size();
                    while (i11 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList4.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i34) {
                            i6Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                i6Var.a(null);
                return;
            case 18:
                int i35 = this.f35376b;
                th.o7 o7Var = ((th.f7) this.f35377c).d;
                th.e7 e7Var = o7Var.f49319n0;
                int i36 = o7Var.h;
                e7Var.A0 = (ArrayList) this.d;
                e7Var.f48786y0 = i36;
                e7Var.setAdapter(null);
                e7Var.setAdapter(e7Var.f48787z0);
                e7Var.setCurrentItem(i35);
                e7Var.C0 = true;
                return;
            case 19:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f35377c, (String) this.d, this.f35376b);
                return;
            case 20:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f35377c, (short[]) this.d, this.f35376b);
                return;
            case 21:
                vh.b4 b4Var = (vh.b4) this.f35377c;
                ig.g gVar = (ig.g) this.d;
                int i37 = this.f35376b;
                if (b4Var.f50996x0.getCurrentBrush() instanceof ig.g) {
                    b4Var.L0 = true;
                }
                b4Var.z(gVar);
                jg.y1 y1Var = b4Var.T0;
                int i38 = y1Var.d + 1;
                y1Var.a(i38);
                org.telegram.messenger.i0.Q3(y1Var.f10371a[i38], i37);
                y1Var.e = true;
                return;
            case 22:
                org.telegram.messenger.i0.g3(new org.telegram.utils.twidget.v(this.f35376b, ((hs) this.f35377c).l0(new ArrayList((HashSet) this.d)), 8));
                return;
            case 23:
                ((vh.s8) this.f35377c).b((short[]) this.d, this.f35376b);
                return;
            case 24:
                int[] iArr3 = (int[]) this.f35377c;
                int i39 = this.f35376b;
                us[] usVarArr = (us[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i39).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (usVarArr[0] != null) {
                    zs.f(i39).n(usVarArr[0], 59);
                    usVarArr[0] = null;
                    return;
                }
                return;
            case 25:
                xh.i3 i3Var = (xh.i3) this.f35377c;
                TLObject tLObject4 = (TLObject) this.d;
                int i40 = this.f35376b;
                if (tLObject4 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject4;
                    i3Var.f53814y = tL_webViewResultUrl.query_id;
                    i3Var.f53809n.t(i40, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    org.telegram.messenger.i0.g3(i3Var.U);
                    return;
                }
                return;
            default:
                zf.z zVar = (zf.z) this.f35377c;
                int i41 = this.f35376b;
                String str5 = (String) this.d;
                int i42 = zVar.f55704s0;
                zVar.f55701r = null;
                if (i41 == zVar.f55686d0) {
                    if (zVar.f55696n >= 0) {
                        ConnectionsManager.getInstance(i42).cancelRequest(zVar.f55696n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str5;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.f55696n = ConnectionsManager.getInstance(i42).sendRequest(tL_channels_searchPosts, new mg.w(zVar, i41, str5, 9));
                    return;
                }
                return;
        }
    }

    public x0(Object obj, int i10, Object obj2, int i11) {
        this.f35375a = i11;
        this.f35377c = obj;
        this.f35376b = i10;
        this.d = obj2;
    }

    public x0(Object obj, Object obj2, int i10, int i11) {
        this.f35375a = i11;
        this.f35377c = obj;
        this.d = obj2;
        this.f35376b = i10;
    }
}

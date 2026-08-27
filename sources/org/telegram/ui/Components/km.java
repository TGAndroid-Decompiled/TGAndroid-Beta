package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class km implements Runnable {

    public final int f30143a;

    public final int f30144b;

    public final Object f30145c;
    public final Object d;

    public km(int i10, Object obj, Object obj2, int i11) {
        this.f30143a = i11;
        this.f30144b = i10;
        this.f30145c = obj;
        this.d = obj2;
    }

    private final void a() {
        MessageObject messageObject = (MessageObject) this.f30145c;
        org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.d;
        HashMap map = k21.P;
        if (map != null) {
            map.remove(Integer.valueOf(k21.o(messageObject)));
        }
        if (j1Var != null) {
            j1Var.i0(3);
        }
        int i10 = this.f30144b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void b() {
        int i10;
        org.telegram.ui.kx kxVar = (org.telegram.ui.kx) this.f30145c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.gy gyVar = kxVar.f39895b0;
        ArrayList arrayList = gyVar.N1;
        if (arrayList == null || (i10 = this.f30144b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        gyVar.N1.add(i10, dialog);
        gyVar.f38498a0[0].q(true);
    }

    private final void c() {
        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f30145c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.fy fyVar = eyVar.f37878g;
        org.telegram.ui.gy gyVar = eyVar.h;
        gyVar.O1 = true;
        gyVar.getMessagesController().addDialogToFolder(dialog.f22384id, 0, this.f30144b, 0L);
        gyVar.O1 = false;
        ArrayList<TLRPC.Dialog> dialogs = gyVar.getMessagesController().getDialogs(0);
        int iIndexOf = dialogs.indexOf(dialog);
        if (iIndexOf < 0) {
            fyVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = gyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || iIndexOf != 1) {
            gyVar.A4(true, true);
            fyVar.f38234x.D();
            fyVar.q(true);
            gyVar.o3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (iIndexOf == 1) {
                gyVar.A4(true, true);
                fyVar.q(true);
                gyVar.o3();
            } else {
                if (!gyVar.N1.isEmpty()) {
                    gyVar.N1.remove(0);
                }
                fyVar.f38234x.D();
                fyVar.q(true);
            }
        }
    }

    private final void e() {
        org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.f30145c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new hh.x(s50Var, this.f30144b, 6));
        b2VarArr[0].show();
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.f30145c;
        TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
        Pattern pattern = LaunchActivity.f35496x1;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
            boolean z10 = tL_help_appUpdate.can_not_skip;
            int i10 = this.f30144b;
            if (z10) {
                launchActivity.I0(i10, tL_help_appUpdate, false);
            } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i10);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        }
    }

    @Override
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r10;
        String pluralString;
        int iDp;
        float fDp;
        SQLiteCursor sQLiteCursorQueryFinalized;
        TLRPC.messages_EmojiGroups messages_emojigroupsTLdeserialize;
        NativeByteBuffer nativeByteBufferByteBufferValue;
        int i10 = 5;
        int i11 = 6;
        UndoView undoView3 = null;
        str = null;
        String str = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = 0;
        switch (this.f30143a) {
            case 0:
                in inVar = (in) this.f30145c;
                int i12 = this.f30144b;
                View view = (View) this.d;
                inVar.R = 0;
                inVar.Q = i12;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    inVar.U((org.telegram.ui.Cells.l8) view, true);
                    return;
                } else {
                    inVar.f29435r.m(inVar.E0);
                    return;
                }
            case 1:
                pu puVar = (pu) this.f30145c;
                a0.h hVar = (a0.h) this.d;
                int i13 = this.f30144b;
                org.telegram.ui.ActionBar.n2 n2Var = puVar.X0.f27548c;
                if (!(n2Var instanceof org.telegram.ui.rn)) {
                    if (n2Var instanceof ProfileActivity) {
                        undoView2 = ((ProfileActivity) n2Var).I;
                    } else {
                        undoView = null;
                    }
                    if (undoView != null) {
                        if (hVar.m() == 1) {
                            undoView.m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i13), 53);
                            return;
                        } else {
                            undoView.k(0L, 53, Integer.valueOf(i13), Integer.valueOf(hVar.m()), null, null);
                            return;
                        }
                    }
                    return;
                }
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var;
                rnVar.Q7();
                undoView2 = rnVar.f42229u3;
                undoView = undoView2;
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).f22384id, Integer.valueOf(i13), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i13), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 2:
                sx sxVar = (sx) this.f30145c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i14 = this.f30144b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new hh.x(sxVar, i14, i10));
                b2VarArr[0].show();
                return;
            case 3:
                int i15 = this.f30144b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f30145c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i15;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new cg.m0(n2Var2, i15, callback, i10));
                return;
            case 4:
                f30 f30Var = (f30) this.f30145c;
                int i16 = this.f30144b;
                ArrayList arrayList = (ArrayList) this.d;
                pf.j1 j1Var = f30Var.d;
                g30 g30Var = f30Var.f28249w;
                if (i16 != f30Var.f28246n) {
                    return;
                }
                f30Var.h = false;
                TLRPC.Chat chat = g30Var.R;
                iw0 iw0Var = g30Var.f32983s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = j1Var.h;
                    ArrayList arrayList2 = j1Var.f45841g;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int size = arrayList.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        TLObject tLObject = (TLObject) arrayList.get(i17);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    j1Var.i();
                }
                int i18 = f30Var.f28245f - 1;
                boolean z10 = iw0Var.getVisibility() == 0;
                f30Var.l();
                if (f30Var.f28245f > i18) {
                    g30Var.J(i18);
                }
                if (f30Var.h || j1Var.e() || !g30Var.d.S0()) {
                    return;
                }
                iw0Var.e(false, z10);
                return;
            case 5:
                t30 t30Var = (t30) this.f30145c;
                int i19 = this.f30144b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = t30Var.K;
                int i20 = t30Var.J;
                if (i19 != t30Var.P) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t30Var.X[0] ? "$" : "#");
                sb2.append(t30Var.U);
                String string = sb2.toString();
                jh.d6 d6Var = t30Var.M;
                if (d6Var == null || !TextUtils.equals(d6Var.C, string)) {
                    t30Var.M = new jh.d6(i20, null, string);
                }
                if (t30Var.M.f13540i.size() <= 0) {
                    r10 = 1;
                    t30Var.M.p(4, true);
                } else {
                    r10 = 1;
                }
                t30Var.L = r10;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags = tL_channels_searchPosts.flags | r10 ? 1 : 0;
                t30Var.U = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList3.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) i0.a.i(r10, arrayList3);
                    tL_channels_searchPosts.offset_rate = t30Var.V;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i20).getInputPeer(messageObject.messageOwner.peer_id);
                }
                t30Var.Q = ConnectionsManager.getInstance(i20).sendRequest(tL_channels_searchPosts, new cg.m0(t30Var, i19, string, i11));
                return;
            case 6:
                k50 k50Var = (k50) this.f30145c;
                int i21 = this.f30144b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                Size[] sizeArr = k50Var.f29975e0;
                if (k50Var.f29973d0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i21);
                }
                if (!k50Var.f29981j0) {
                    if (i21 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(sizeArr[0].getWidth(), sizeArr[0].getHeight());
                    k50Var.f29982k0 = new CameraSession(k50Var.f30000y, sizeArr[0], k50Var.f29977f0, 256, true);
                    k50Var.r();
                    b50 b50Var = k50Var.f29973d0;
                    CameraSession cameraSession = k50Var.f29982k0;
                    Handler handler = b50Var.getHandler();
                    if (handler != null) {
                        b50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(k50Var.f29982k0, surfaceTexture, new s40(k50Var, 1), new s40(k50Var, 2));
                    return;
                }
                if (k50Var.f29983l0) {
                    Camera2Session camera2Session = k50Var.m0[i21];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i21 == 1) {
                    return;
                }
                b50 b50Var2 = k50Var.f29973d0;
                Camera2Session camera2Session2 = k50Var.f29985n0;
                Handler handler2 = b50Var2.getHandler();
                if (handler2 != null) {
                    b50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                k50Var.f29985n0.open(surfaceTexture);
                return;
            case 7:
                j50 j50Var = (j50) this.f30145c;
                int i22 = this.f30144b;
                e50 e50Var = (e50) this.d;
                k50 k50Var2 = j50Var.D0;
                VideoEditedInfo videoEditedInfo = k50Var2.J;
                int i23 = k50Var2.f29967a;
                c50 c50Var = k50Var2.f29971c;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    k50Var2.J = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (k50Var2.J.needConvert()) {
                    k50Var2.D = null;
                    k50Var2.E = null;
                    k50Var2.F = null;
                    k50Var2.G = null;
                    VideoEditedInfo videoEditedInfo3 = k50Var2.J;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    double d = j10;
                    long j11 = videoEditedInfo3.startTime;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = videoEditedInfo3.endTime;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    videoEditedInfo3.estimatedDuration = j13;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * k50Var2.H));
                    VideoEditedInfo videoEditedInfo4 = k50Var2.J;
                    videoEditedInfo4.bitrate = 1000000;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i23).cancelFileUpload(k50Var2.T.getAbsolutePath(), false);
                } else {
                    k50Var2.J.estimatedSize = Math.max(1L, k50Var2.H);
                }
                VideoEditedInfo videoEditedInfo5 = k50Var2.J;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = k50Var2.D;
                videoEditedInfo5.encryptedFile = k50Var2.E;
                videoEditedInfo5.key = k50Var2.F;
                videoEditedInfo5.iv = k50Var2.G;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = j50Var.f29594a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = k50Var2.J;
                if (i22 != 1) {
                    j50Var.h(j50Var.f29594a);
                    videoEditedInfo6.estimatedDuration = k50Var2.f29970b0;
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(k50Var2.M), videoEditedInfo6, j50Var.f29594a.getAbsolutePath(), j50Var.f29624w0);
                    return;
                }
                if (c50Var.c()) {
                    Activity parentActivity = c50Var.getParentActivity();
                    long jA = c50Var.a();
                    ag.l0 l0Var = new ag.l0(j50Var, e50Var, videoEditedInfo6, 29);
                    g50 g50Var = new g50(j50Var, 0);
                    org.telegram.ui.ActionBar.c6 c6Var = k50Var2.L0;
                    Pattern pattern = y4.f34802a;
                    y4.K(parentActivity, jA, -1L, 0, false, l0Var, g50Var, new w4(c6Var), c6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.f29594a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (e50Var != null) {
                        photoEntry.ttl = e50Var.f27953c;
                        photoEntry.effectId = e50Var.d;
                    }
                    k50Var2.f29971c.s(photoEntry, videoEditedInfo6, e50Var == null || e50Var.f27951a, e50Var != null ? e50Var.f27952b : 0, 0, false, e50Var != null ? e50Var.f27954e : 0L);
                }
                k50Var2.J = null;
                return;
            case 8:
                wi0 wi0Var = (wi0) this.f30145c;
                int i24 = this.f30144b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i25 = wi0Var.f34220f;
                TextView textView = wi0Var.f34217b;
                MessageObject messageObject2 = wi0Var.f34223s;
                ImageView imageView = wi0Var.d;
                n9 n9Var = wi0Var.f34219e;
                ArrayList arrayList4 = wi0Var.f34222r;
                ArrayList arrayList5 = wi0Var.f34221n;
                if (arrayList5.isEmpty() || arrayList5.size() < i24) {
                    pluralString = LocaleController.formatPluralString("ReactionsCount", i24, new Object[0]);
                } else {
                    pluralString = String.format(LocaleController.getPluralString("Reacted", i24), i24 == arrayList5.size() ? String.valueOf(i24) : i24 + "/" + arrayList5.size());
                }
                if (wi0Var.getMeasuredWidth() > 0) {
                    wi0Var.v = wi0Var.getMeasuredWidth();
                }
                textView.setText(pluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions == null || tL_messageReactions.results.size() != 1 || tL_messages_messageReactionsList.reactions.isEmpty()) {
                    imageView.setVisibility(0);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).start();
                } else {
                    Iterator<TLRPC.TL_availableReaction> it = MediaDataController.getInstance(i25).getReactionsList().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TLRPC.TL_availableReaction next = it.next();
                            if (next.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                                n9Var.i(ImageLocation.getForDocument(next.center_icon), "40_40_lastreactframe", "webp", null, next);
                                n9Var.setVisibility(0);
                                n9Var.setAlpha(0.0f);
                                n9Var.animate().alpha(1.0f).start();
                                imageView.setVisibility(8);
                            }
                        } else {
                            imageView.setVisibility(0);
                            imageView.setAlpha(0.0f);
                            imageView.animate().alpha(1.0f).start();
                        }
                    }
                }
                ArrayList<TLRPC.User> arrayList6 = tL_messages_messageReactionsList.users;
                int size2 = arrayList6.size();
                int i26 = 0;
                while (i26 < size2) {
                    TLRPC.User user = arrayList6.get(i26);
                    i26++;
                    TLRPC.User user2 = user;
                    TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                    int i27 = size2;
                    if (peer != null && user2.f22527id != peer.user_id) {
                        int i28 = 0;
                        while (true) {
                            if (i28 >= arrayList4.size()) {
                                arrayList4.add(new vi0(0, user2));
                            }
                            int i29 = i28;
                            if (((vi0) arrayList4.get(i28)).f33425b != user2.f22527id) {
                                i28 = i29 + 1;
                            }
                            break;
                            break;
                        }
                    }
                    size2 = i27;
                }
                ArrayList<TLRPC.Chat> arrayList7 = tL_messages_messageReactionsList.chats;
                int size3 = arrayList7.size();
                int i30 = 0;
                while (i30 < size3) {
                    TLRPC.Chat chat2 = arrayList7.get(i30);
                    i30++;
                    TLRPC.Chat chat3 = chat2;
                    TLRPC.Peer peer2 = messageObject2.messageOwner.from_id;
                    if (peer2 != null && chat3.f22380id != peer2.user_id) {
                        int i31 = 0;
                        while (true) {
                            if (i31 >= arrayList4.size()) {
                                arrayList4.add(new vi0(0, chat3));
                            } else if (((vi0) arrayList4.get(i31)).f33425b != (-chat3.f22380id)) {
                                i31++;
                            }
                            break;
                        }
                    }
                }
                h00 h00Var = wi0Var.f34216a;
                b9 b9Var = wi0Var.f34218c;
                wi0Var.setEnabled(arrayList4.size() > 0);
                for (int i32 = 0; i32 < 3; i32++) {
                    if (i32 < arrayList4.size()) {
                        b9Var.b(i32, ((vi0) arrayList4.get(i32)).f33424a, i25);
                    } else {
                        b9Var.b(i32, null, i25);
                    }
                }
                int size4 = arrayList4.size();
                if (size4 != 1) {
                    if (size4 != 2) {
                        fDp = 0.0f;
                    } else {
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    if (LocaleController.isRTL) {
                        fDp = AndroidUtilities.dp(12.0f);
                    }
                    b9Var.setTranslationX(fDp);
                    b9Var.a(false);
                    textView.animate().alpha(1.0f).setDuration(220L).start();
                    b9Var.animate().alpha(1.0f).setDuration(220L).start();
                    h00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var)).start();
                    return;
                }
                iDp = AndroidUtilities.dp(24.0f);
                fDp = iDp;
                if (LocaleController.isRTL) {
                    fDp = AndroidUtilities.dp(12.0f);
                }
                b9Var.setTranslationX(fDp);
                b9Var.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                b9Var.animate().alpha(1.0f).setDuration(220L).start();
                h00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var)).start();
                return;
            case 9:
                op0 op0Var = (op0) this.f30145c;
                int i33 = this.f30144b;
                ArrayList arrayList8 = (ArrayList) this.d;
                mp0 mp0Var = op0Var.f31375e;
                sp0 sp0Var = op0Var.G;
                if (i33 != op0Var.f31378r) {
                    return;
                }
                op0Var.h();
                op0Var.E = false;
                op0Var.v = i33;
                if (op0Var.f31379s != i33) {
                    mp0Var.b();
                }
                so0 so0Var = sp0Var.B;
                op0 op0Var2 = sp0Var.I;
                if (so0Var.getAdapter() != op0Var2) {
                    sp0.F0(sp0Var);
                    op0Var2.l();
                }
                for (int i34 = 0; i34 < arrayList8.size(); i34++) {
                    TLObject tLObject2 = ((fp0) arrayList8.get(i34)).f28429b;
                    if (tLObject2 instanceof TLRPC.User) {
                        MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                boolean z11 = !op0Var.d.isEmpty() && arrayList8.isEmpty();
                if (op0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z11) {
                    sp0.F0(sp0Var);
                }
                op0Var.d = arrayList8;
                mp0Var.f(arrayList8, null);
                int i35 = op0Var.F;
                if (op0Var.h() != 0 || mp0Var.e() || op0Var.E) {
                    sp0Var.f32544t0.b(i35);
                } else {
                    sp0Var.M.e(false, true);
                }
                op0Var.l();
                sp0Var.K0(true);
                return;
            case 10:
                hu0 hu0Var = (hu0) this.f30145c;
                hu0Var.getStoriesController().c(this.f30144b, hu0Var.f29121f1, (TL_stories.StoryItem) this.d);
                return;
            case 11:
                hu0 hu0Var2 = (hu0) this.f30145c;
                int i36 = this.f30144b;
                b70 b70Var = (b70) this.d;
                hu0Var2.d1(i36);
                b70Var.u();
                return;
            case 12:
                hu0 hu0Var3 = (hu0) this.f30145c;
                hu0Var3.S(this.f30144b, (zk0) this.d, false);
                hu0Var3.F1 = null;
                return;
            case 13:
                ks0 ks0Var = (ks0) this.f30145c;
                int i37 = this.f30144b;
                b70 b70Var2 = (b70) this.d;
                ks0Var.d.c1(i37, false);
                b70Var2.u();
                return;
            case 14:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.f30145c;
                a0.h hVar3 = (a0.h) this.d;
                int i38 = this.f30144b;
                if (n2Var3 instanceof org.telegram.ui.rn) {
                    org.telegram.ui.rn rnVar2 = (org.telegram.ui.rn) n2Var3;
                    rnVar2.Q7();
                    undoView3 = rnVar2.f42229u3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var3).I;
                }
                if (undoView3 != null) {
                    if (hVar3.m() == 1) {
                        undoView3.m(((TLRPC.Dialog) hVar3.n(0)).f22384id, Integer.valueOf(i38), 53);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i38), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 15:
                st0 st0Var = (st0) this.f30145c;
                int i39 = this.f30144b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i39 != st0Var.A) {
                    return;
                }
                st0Var.f32566y = ConnectionsManager.getInstance(st0Var.d).sendRequest(tL_messages_search, new hh.u1(st0Var, i39, i11));
                return;
            case 16:
                st0 st0Var2 = (st0) this.f30145c;
                TLObject tLObject3 = (TLObject) this.d;
                int i40 = this.f30144b;
                ArrayList arrayList9 = st0Var2.h;
                int i41 = st0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i40 == st0Var2.A) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i41).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i41).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i41).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i42 = 0; i42 < messages_messages.messages.size(); i42++) {
                        MessageObject messageObject3 = new MessageObject(i41, messages_messages.messages.get(i42), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(st0Var2.f32564w);
                        arrayList9.add(messageObject3);
                    }
                    st0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        st0Var2.f32563s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        st0Var2.f32563s = true;
                    }
                    st0Var2.G(false);
                    st0Var2.f32562r = false;
                    st0Var2.f32566y = -1;
                    return;
                }
                return;
            case 17:
                hv0 hv0Var = (hv0) this.f30145c;
                int i43 = this.f30144b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                hv0Var.U0 = false;
                if (!hv0Var.R0 && hv0Var.S0) {
                    hv0Var.A(true);
                    return;
                }
                hv0Var.f31319j0 = hv0Var.f29167b1[0];
                hv0Var.j();
                DownloadController.getInstance(i43).removeLoadingFileObserver(s1Var);
                hv0Var.G();
                hv0Var.v();
                return;
            case 18:
                int i44 = this.f30144b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.f30145c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i44).getDatabase();
                    if (database != null) {
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            sQLitePreparedStatementExecuteFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.bindInteger(1, num.intValue());
                            sQLitePreparedStatementExecuteFast.bindByteBuffer(2, nativeByteBuffer);
                            sQLitePreparedStatementExecuteFast.step();
                            nativeByteBuffer.reuse();
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 19:
                int i45 = this.f30144b;
                Integer num2 = (Integer) this.f30145c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i45).getDatabase();
                        if (database2 != null) {
                            sQLiteCursorQueryFinalized = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursorQueryFinalized.next() || (nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0)) == null) {
                                    messages_emojigroupsTLdeserialize = null;
                                } else {
                                    messages_emojigroupsTLdeserialize = TLRPC.messages_EmojiGroups.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), true);
                                    nativeByteBufferByteBufferValue.reuse();
                                }
                                if (messages_emojigroupsTLdeserialize instanceof TLRPC.TL_messages_emojiGroups) {
                                    TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups2 = (TLRPC.TL_messages_emojiGroups) messages_emojigroupsTLdeserialize;
                                    callback2.run(Long.valueOf(tL_messages_emojiGroups2.hash), tL_messages_emojiGroups2);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor = sQLiteCursorQueryFinalized;
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursorQueryFinalized != null) {
                                    sQLiteCursorQueryFinalized.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor2 = num2;
                        if (sQLiteCursor2 != 0) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursorQueryFinalized = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor2 != 0) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
                break;
            case 20:
                rw0 rw0Var = (rw0) this.f30145c;
                a0.h hVar4 = (a0.h) this.d;
                int i46 = this.f30144b;
                org.telegram.ui.ActionBar.n2 n2Var4 = rw0Var.X0.H;
                if (n2Var4 instanceof org.telegram.ui.rn) {
                    org.telegram.ui.rn rnVar3 = (org.telegram.ui.rn) n2Var4;
                    rnVar3.Q7();
                    undoView4 = rnVar3.f42229u3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) n2Var4).I;
                }
                if (undoView4 != null) {
                    if (hVar4.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) hVar4.n(0)).f22384id, Integer.valueOf(i46), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i46), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                wx0 wx0Var = (wx0) this.f30145c;
                String str3 = (String) this.d;
                int i47 = this.f30144b;
                ArrayList<MediaDataController.KeywordResult> arrayList10 = new ArrayList<>(1);
                arrayList10.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(wx0Var.f34363a).fillWithAnimatedEmoji(arrayList10, 15, false, false, false, new ag.k0(wx0Var, i47, str3, arrayList10));
                return;
            case 22:
                t01 t01Var = (t01) this.f30145c;
                String str4 = (String) this.d;
                int i48 = this.f30144b;
                s01 s01Var = t01Var.f32611r.f26565n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        t01Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ag.k0(t01Var, t01Var.d, new ArrayList(), new ArrayList(), 28));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                    }
                    int i49 = (str != null ? 1 : 0) + 1;
                    String[] strArr = new String[i49];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    int size5 = s01Var.d.size();
                    for (int i50 = 0; i50 < size5; i50++) {
                        ArrayList arrayList13 = (ArrayList) s01Var.d.get(i50);
                        String strI = org.telegram.ui.ActionBar.e5.i(((org.telegram.ui.ActionBar.i6) arrayList13.get(0)).f23517f);
                        String lowerCase2 = strI.toLowerCase();
                        for (int i51 = 0; i51 < i49; i51++) {
                            String str5 = strArr[i51];
                            if (lowerCase2.contains(str5)) {
                                arrayList11.add(arrayList13);
                                arrayList12.add(t01.E(strI, str5));
                            }
                            break;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ag.k0(t01Var, i48, arrayList11, arrayList12, 28));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 23:
                AndroidUtilities.runOnUIThread(new ag.k0((b11) this.f30145c, (zo) this.d, this.f30144b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 29));
                return;
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                org.telegram.ui.ci ciVar = (org.telegram.ui.ci) this.f30145c;
                TLObject tLObject4 = (TLObject) this.d;
                int i52 = this.f30144b;
                if (tLObject4 instanceof TLRPC.User) {
                    ciVar.f40511a = (TLRPC.User) tLObject4;
                    MessagesController.getInstance(i52).putUser(ciVar.f40511a, false);
                }
                h00 h00Var2 = ciVar.f40513c;
                p80 p80Var = ciVar.f40512b;
                ciVar.setEnabled(ciVar.f40511a != null);
                TLRPC.User user3 = ciVar.f40511a;
                if (user3 != null) {
                    p80Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user3)), new cg.b2(ciVar, user3.f22527id, 28)));
                }
                p80Var.animate().alpha(1.0f).setDuration(220L).start();
                h00Var2.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.go(h00Var2)).start();
                return;
        }
    }

    public km(Object obj, int i10, Object obj2, int i11) {
        this.f30143a = i11;
        this.f30145c = obj;
        this.f30144b = i10;
        this.d = obj2;
    }

    public km(Object obj, Object obj2, int i10, int i11) {
        this.f30143a = i11;
        this.f30145c = obj;
        this.d = obj2;
        this.f30144b = i10;
    }
}

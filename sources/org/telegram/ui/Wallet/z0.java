package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cy0;
public final class z0 {
    public final int f37534a;
    public final String f37535b;
    public final l0 f37536c;
    public boolean d;
    public boolean e;
    public String f37537f;
    public int f37538g;
    public int h;
    public int f37540j;
    public uc.u f37541k;
    public long f37542l;
    public int f37539i = -1;
    public final w0 f37543m = new Runnable(this) {
        public final z0 f37406b;

        {
            this.f37406b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f37406b.e();
                    return;
                case 1:
                    z0 z0Var = this.f37406b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f37406b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f37544n = new Runnable(this) {
        public final z0 f37406b;

        {
            this.f37406b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f37406b.e();
                    return;
                case 1:
                    z0 z0Var = this.f37406b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f37406b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final w0 f37545o = new Runnable(this) {
        public final z0 f37406b;

        {
            this.f37406b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f37406b.e();
                    return;
                case 1:
                    z0 z0Var = this.f37406b;
                    if (z0Var.d) {
                        z0Var.d("URL expired; renewing connection");
                        z0Var.b();
                        z0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f37406b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final cy0 f37546p = new cy0(this, 5);

    public z0(int i10, String str, l0 l0Var) {
        this.f37534a = i10;
        this.f37535b = str;
        this.f37536c = l0Var;
    }

    public static String a(uc.v vVar) {
        String str;
        ca.a aVar;
        switch (vVar.f49698a) {
            case 1:
                str = "NOT_IN_CREATED_STATE";
                break;
            case 2:
                str = "SOCKET_INPUT_STREAM_FAILURE";
                break;
            case 3:
                str = "SOCKET_OUTPUT_STREAM_FAILURE";
                break;
            case 4:
                str = "OPENING_HAHDSHAKE_REQUEST_FAILURE";
                break;
            case 5:
                str = "OPENING_HANDSHAKE_RESPONSE_FAILURE";
                break;
            case 6:
                str = "STATUS_LINE_EMPTY";
                break;
            case 7:
                str = "STATUS_LINE_BAD_FORMAT";
                break;
            case 8:
                str = "NOT_SWITCHING_PROTOCOLS";
                break;
            case 9:
                str = "HTTP_HEADER_FAILURE";
                break;
            case 10:
                str = "NO_UPGRADE_HEADER";
                break;
            case 11:
                str = "NO_WEBSOCKET_IN_UPGRADE_HEADER";
                break;
            case 12:
                str = "NO_CONNECTION_HEADER";
                break;
            case 13:
                str = "NO_UPGRADE_IN_CONNECTION_HEADER";
                break;
            case 14:
                str = "NO_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 15:
                str = "UNEXPECTED_SEC_WEBSOCKET_ACCEPT_HEADER";
                break;
            case 16:
                str = "EXTENSION_PARSE_ERROR";
                break;
            case 17:
                str = "UNSUPPORTED_EXTENSION";
                break;
            case 18:
                str = "EXTENSIONS_CONFLICT";
                break;
            case 19:
                str = "UNSUPPORTED_PROTOCOL";
                break;
            case 20:
                str = "INSUFFICENT_DATA";
                break;
            case 21:
                str = "INVALID_PAYLOAD_LENGTH";
                break;
            case 22:
                str = "TOO_LONG_PAYLOAD";
                break;
            case 23:
                str = "INSUFFICIENT_MEMORY_FOR_PAYLOAD";
                break;
            case 24:
                str = "INTERRUPTED_IN_READING";
                break;
            case 25:
                str = "IO_ERROR_IN_READING";
                break;
            case 26:
                str = "IO_ERROR_IN_WRITING";
                break;
            case 27:
                str = "FLUSH_ERROR";
                break;
            case 28:
                str = "NON_ZERO_RESERVED_BITS";
                break;
            case 29:
                str = "UNEXPECTED_RESERVED_BIT";
                break;
            case 30:
                str = "FRAME_MASKED";
                break;
            case 31:
                str = "UNKNOWN_OPCODE";
                break;
            case 32:
                str = "FRAGMENTED_CONTROL_FRAME";
                break;
            case 33:
                str = "UNEXPECTED_CONTINUATION_FRAME";
                break;
            case 34:
                str = "CONTINUATION_NOT_CLOSED";
                break;
            case 35:
                str = "TOO_LONG_CONTROL_FRAME_PAYLOAD";
                break;
            case 36:
                str = "MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 37:
                str = "TEXT_MESSAGE_CONSTRUCTION_ERROR";
                break;
            case 38:
                str = "UNEXPECTED_ERROR_IN_READING_THREAD";
                break;
            case 39:
                str = "UNEXPECTED_ERROR_IN_WRITING_THREAD";
                break;
            case 40:
                str = "PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER";
                break;
            case 41:
                str = "PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS";
                break;
            case 42:
                str = "COMPRESSION_ERROR";
                break;
            case 43:
                str = "DECOMPRESSION_ERROR";
                break;
            case 44:
                str = "SOCKET_CONNECT_ERROR";
                break;
            case 45:
                str = "PROXY_HANDSHAKE_ERROR";
                break;
            case 46:
                str = "SOCKET_OVERLAY_ERROR";
                break;
            case 47:
                str = "SSL_HANDSHAKE_ERROR";
                break;
            case 48:
                str = "NO_MORE_FRAME";
                break;
            case 49:
                str = "HOSTNAME_UNVERIFIED";
                break;
            default:
                str = "null";
                break;
        }
        if ((vVar instanceof uc.n) && (aVar = ((uc.n) vVar).f49662b) != null) {
            StringBuilder l4 = b10.l(str, ", HTTP ");
            l4.append(aVar.f6170c);
            return l4.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f37541k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.e);
        sb2.append(", URL request=");
        sb2.append(this.f37539i);
        d(sb2.toString());
        this.h++;
        this.e = false;
        AndroidUtilities.cancelRunOnUIThread(this.f37543m);
        AndroidUtilities.cancelRunOnUIThread(this.f37544n);
        AndroidUtilities.cancelRunOnUIThread(this.f37545o);
        AndroidUtilities.cancelRunOnUIThread(this.f37546p);
        if (this.f37539i >= 0) {
            ConnectionsManager.getInstance(this.f37534a).cancelRequest(this.f37539i, true);
            this.f37539i = -1;
        }
        uc.u uVar = this.f37541k;
        this.f37541k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(uc.u uVar, int i10) {
        if (this.d && this.f37541k == uVar && this.h == i10) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        FileLog.d("[gram-wallet-streaming] account=" + this.f37534a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f37543m);
        final int i10 = this.h + 1;
        this.h = i10;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f37540j);
        AndroidUtilities.runOnUIThread(this.f37545o, 30000L);
        this.f37539i = ConnectionsManager.getInstance(this.f37534a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                Object valueOf;
                z0 z0Var = z0.this;
                int i11 = i10;
                long j10 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (z0Var.d && z0Var.h == i11) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j10);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    z0Var.d(sb2.toString());
                    z0Var.f37539i = -1;
                    AndroidUtilities.cancelRunOnUIThread(z0Var.f37545o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(z0Var.f37534a).getCurrentTime()) * 1000;
                        z0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            z0Var.f("received expired streaming URL");
                            return;
                        }
                        AndroidUtilities.runOnUIThread(z0Var.f37544n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        z0Var.d("opening websocket; attempt=" + i11);
                        try {
                            d5.z zVar = new d5.z(14, (short) 0);
                            zVar.f8026b = 10000;
                            uc.u g7 = zVar.g(str);
                            z0Var.f37541k = g7;
                            y0 y0Var = new y0(z0Var, i11, elapsedRealtime2);
                            c2.b bVar = g7.d;
                            synchronized (((ArrayList) bVar.f5931c)) {
                                ((ArrayList) bVar.f5931c).add(y0Var);
                                bVar.f5929a = true;
                            }
                            AndroidUtilities.runOnUIThread(z0Var.f37545o, 30000L);
                            uc.u uVar = z0Var.f37541k;
                            uVar.getClass();
                            uc.b bVar2 = new uc.b("ConnectThread", uVar, 3, 0);
                            c2.b bVar3 = uVar.d;
                            if (bVar3 != null) {
                                ArrayList arrayList = (ArrayList) bVar3.n();
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj3 = arrayList.get(i12);
                                    i12++;
                                    y0 y0Var2 = (y0) obj3;
                                    try {
                                        try {
                                            y0Var2.getClass();
                                        } catch (Throwable unused) {
                                            y0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar2.start();
                            return;
                        } catch (Exception e) {
                            z0Var.f("could not open websocket: ".concat(e.getClass().getSimpleName()));
                            return;
                        }
                    }
                    z0Var.f("could not obtain streaming URL");
                    return;
                }
                z0Var.d("ignoring stale URL response; attempt=" + i11);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i10 = this.f37540j;
        this.f37540j = i10 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i10, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        AndroidUtilities.runOnUIThread(this.f37543m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        uc.u uVar = this.f37541k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f49701a = true;
        obj.e = 1;
        if (str != null && str.length() != 0) {
            obj.c(uc.k.a(str));
        } else {
            obj.f49705g = null;
        }
        uVar.g(obj);
    }

    public final void h() {
        if (!this.d) {
            return;
        }
        d("stopping");
        this.d = false;
        b();
    }
}

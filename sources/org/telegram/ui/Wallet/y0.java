package org.telegram.ui.Wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.Components.zj;
public final class y0 {
    public final int f44691a;
    public final String f44692b;
    public final l0 f44693c;
    public boolean d;
    public boolean f44694e;
    public String f44695f;
    public int f44696g;
    public int h;
    public int f44698j;
    public rc.u f44699k;
    public long f44700l;
    public int f44697i = -1;
    public final v0 f44701m = new Runnable(this) {
        public final y0 f44581b;

        {
            this.f44581b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44581b.e();
                    return;
                case 1:
                    y0 y0Var = this.f44581b;
                    if (y0Var.d) {
                        y0Var.d("URL expired; renewing connection");
                        y0Var.b();
                        y0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44581b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final v0 f44702n = new Runnable(this) {
        public final y0 f44581b;

        {
            this.f44581b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44581b.e();
                    return;
                case 1:
                    y0 y0Var = this.f44581b;
                    if (y0Var.d) {
                        y0Var.d("URL expired; renewing connection");
                        y0Var.b();
                        y0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44581b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final v0 f44703o = new Runnable(this) {
        public final y0 f44581b;

        {
            this.f44581b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f44581b.e();
                    return;
                case 1:
                    y0 y0Var = this.f44581b;
                    if (y0Var.d) {
                        y0Var.d("URL expired; renewing connection");
                        y0Var.b();
                        y0Var.e();
                        return;
                    }
                    return;
                default:
                    this.f44581b.f("connection or subscription timed out");
                    return;
            }
        }
    };
    public final zj f44704p = new zj(this, 26);

    public y0(int i7, String str, l0 l0Var) {
        this.f44691a = i7;
        this.f44692b = str;
        this.f44693c = l0Var;
    }

    public static String a(rc.v vVar) {
        String str;
        com.google.android.gms.internal.clearcut.y0 y0Var;
        switch (vVar.f55987a) {
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
        if ((vVar instanceof rc.n) && (y0Var = ((rc.n) vVar).f55946b) != null) {
            StringBuilder m10 = r.b.m(str, ", HTTP ");
            m10.append(y0Var.f6684b);
            return m10.toString();
        }
        return str;
    }

    public final void b() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("disconnecting; socket=");
        if (this.f44699k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", subscribed=");
        sb2.append(this.f44694e);
        sb2.append(", URL request=");
        sb2.append(this.f44697i);
        d(sb2.toString());
        this.h++;
        this.f44694e = false;
        org.telegram.messenger.g0.r(this.f44701m);
        org.telegram.messenger.g0.r(this.f44702n);
        org.telegram.messenger.g0.r(this.f44703o);
        org.telegram.messenger.g0.r(this.f44704p);
        if (this.f44697i >= 0) {
            ConnectionsManager.getInstance(this.f44691a).cancelRequest(this.f44697i, true);
            this.f44697i = -1;
        }
        rc.u uVar = this.f44699k;
        this.f44699k = null;
        if (uVar != null) {
            uVar.c();
        }
    }

    public final boolean c(rc.u uVar, int i7) {
        if (this.d && this.f44699k == uVar && this.h == i7) {
            return true;
        }
        return false;
    }

    public final void d(String str) {
        org.telegram.messenger.a8.b("[gram-wallet-streaming] account=" + this.f44691a + " generation=" + this.h + " " + str);
    }

    public final void e() {
        if (!this.d) {
            return;
        }
        org.telegram.messenger.g0.r(this.f44701m);
        final int i7 = this.h + 1;
        this.h = i7;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        d("requesting streaming URL; retry=" + this.f44698j);
        org.telegram.messenger.g0.i3(this.f44703o, 30000L);
        this.f44697i = ConnectionsManager.getInstance(this.f44691a).sendRequestTyped(new TL_toncenter.getStreamingUrl(), new d3.b(1), new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                Object valueOf;
                y0 y0Var = y0.this;
                int i10 = i7;
                long j3 = elapsedRealtime;
                TL_toncenter.streamingUrl streamingurl = (TL_toncenter.streamingUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (y0Var.d && y0Var.h == i10) {
                    StringBuilder sb2 = new StringBuilder("URL response after ");
                    sb2.append(SystemClock.elapsedRealtime() - j3);
                    sb2.append(" ms; errorCode=");
                    if (tL_error == null) {
                        valueOf = "none";
                    } else {
                        valueOf = Integer.valueOf(tL_error.code);
                    }
                    sb2.append(valueOf);
                    y0Var.d(sb2.toString());
                    y0Var.f44697i = -1;
                    org.telegram.messenger.g0.r(y0Var.f44703o);
                    if (streamingurl != null && !TextUtils.isEmpty(streamingurl.url)) {
                        long currentTime = (streamingurl.expires - ConnectionsManager.getInstance(y0Var.f44691a).getCurrentTime()) * 1000;
                        y0Var.d("URL expires=" + streamingurl.expires + ", remaining=" + currentTime + " ms");
                        if (currentTime <= 0) {
                            y0Var.f("received expired streaming URL");
                            return;
                        }
                        org.telegram.messenger.g0.i3(y0Var.f44702n, currentTime);
                        String str = streamingurl.url;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        y0Var.d("opening websocket; attempt=" + i10);
                        try {
                            f5.v vVar = new f5.v(16, (short) 0);
                            vVar.f11018b = 10000;
                            rc.u h = vVar.h(str);
                            y0Var.f44699k = h;
                            x0 x0Var = new x0(y0Var, i10, elapsedRealtime2);
                            ab.q qVar = h.d;
                            synchronized (((ArrayList) qVar.f990c)) {
                                ((ArrayList) qVar.f990c).add(x0Var);
                                qVar.f988a = true;
                            }
                            org.telegram.messenger.g0.i3(y0Var.f44703o, 30000L);
                            rc.u uVar = y0Var.f44699k;
                            uVar.getClass();
                            rc.b bVar = new rc.b("ConnectThread", uVar, 3, 0);
                            ab.q qVar2 = uVar.d;
                            if (qVar2 != null) {
                                ArrayList arrayList = (ArrayList) qVar2.p();
                                int size = arrayList.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    Object obj3 = arrayList.get(i11);
                                    i11++;
                                    x0 x0Var2 = (x0) obj3;
                                    try {
                                        try {
                                            x0Var2.getClass();
                                        } catch (Throwable unused) {
                                            x0Var2.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            bVar.start();
                            return;
                        } catch (Exception e10) {
                            y0Var.f("could not open websocket: ".concat(e10.getClass().getSimpleName()));
                            return;
                        }
                    }
                    y0Var.f("could not obtain streaming URL");
                    return;
                }
                y0Var.d("ignoring stale URL response; attempt=" + i10);
            }
        });
    }

    public final void f(String str) {
        if (!this.d) {
            return;
        }
        b();
        int i7 = this.f44698j;
        this.f44698j = i7 + 1;
        long min = Math.min(30000L, 1000 << Math.min(i7, 5)) + ((long) (Math.random() * 500.0d));
        d(str + "; retrying in " + min + " ms");
        org.telegram.messenger.g0.i3(this.f44701m, min);
    }

    public final void g(String str) {
        d("send -> " + str);
        rc.u uVar = this.f44699k;
        uVar.getClass();
        ?? obj = new Object();
        obj.f55990a = true;
        obj.f55993e = 1;
        if (str != null && str.length() != 0) {
            obj.c(rc.k.a(str));
        } else {
            obj.f55995g = null;
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

package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class mu extends org.telegram.ui.Components.rl0 {
    public final Context f39069c;
    public final DataSettingsActivity d;

    public mu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f39069c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = m1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.f34098e && b10 != dataSettingsActivity.f34099f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f34102s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.B && b10 != dataSettingsActivity.f34105y && b10 != dataSettingsActivity.C && b10 != dataSettingsActivity.D && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.H && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.f34100n) {
                        i13 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (b10 != i13) {
                            i14 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (b10 != i14) {
                                i15 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (b10 != i15) {
                                    i16 = dataSettingsActivity.resetDownloadRow;
                                    if (b10 != i16) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.R;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f34101r && i10 != dataSettingsActivity.f34103w && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.N && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.Q) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f34104x && i10 != dataSettingsActivity.J && i10 != 0 && i10 != dataSettingsActivity.M && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.P) {
                if (i10 != dataSettingsActivity.B && i10 != dataSettingsActivity.f34105y && i10 != dataSettingsActivity.C && i10 != dataSettingsActivity.D && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.H) {
                    if (i10 == dataSettingsActivity.E) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.f34098e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f34099f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f34102s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f34100n) {
                                        return 1;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 5;
                        }
                        return 5;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mu.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View z6Var;
        Context context = this.f39069c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                z6Var = new org.telegram.ui.Cells.o8(context);
                            } else {
                                z6Var = new org.telegram.ui.Cells.j5(context);
                            }
                        } else {
                            z6Var = new org.telegram.ui.Cells.a9(context);
                        }
                    } else {
                        z6Var = new org.telegram.ui.Cells.s8(context);
                    }
                } else {
                    z6Var = new org.telegram.ui.Cells.m4(context, 22);
                }
            } else {
                z6Var = new org.telegram.ui.Cells.aa(context);
            }
        } else {
            z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        }
        return yh.o(z6Var, z6Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        if (m1Var.f5879f == 3) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) m1Var.f5875a;
            int b10 = m1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.B) {
                s8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f34105y) {
                s8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.C) {
                s8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.D) {
                s8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.G) {
                s8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.H) {
                s8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}

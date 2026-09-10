package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.SharedConfig;
public final class pu extends org.telegram.ui.Components.ul0 {
    public final Context f35902c;
    public final DataSettingsActivity d;

    public pu(DataSettingsActivity dataSettingsActivity, Context context) {
        this.d = dataSettingsActivity;
        this.f35902c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = c1Var.b();
        DataSettingsActivity dataSettingsActivity = this.d;
        if (b10 != dataSettingsActivity.e && b10 != dataSettingsActivity.f29895f && b10 != dataSettingsActivity.h && b10 != dataSettingsActivity.f29898s) {
            i10 = dataSettingsActivity.useLessDataForCallsRow;
            if (b10 != i10 && b10 != dataSettingsActivity.v) {
                i11 = dataSettingsActivity.proxyRow;
                if (b10 != i11) {
                    i12 = dataSettingsActivity.clearDraftsRow;
                    if (b10 != i12 && b10 != dataSettingsActivity.E && b10 != dataSettingsActivity.f29901y && b10 != dataSettingsActivity.F && b10 != dataSettingsActivity.G && b10 != dataSettingsActivity.N && b10 != dataSettingsActivity.K && b10 != dataSettingsActivity.J && b10 != dataSettingsActivity.f29896n) {
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
        return this.d.U;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        DataSettingsActivity dataSettingsActivity = this.d;
        if (i10 != dataSettingsActivity.f29897r && i10 != dataSettingsActivity.f29899w && i10 != dataSettingsActivity.O && i10 != dataSettingsActivity.Q && i10 != dataSettingsActivity.L && i10 != dataSettingsActivity.R && i10 != dataSettingsActivity.T) {
            if (i10 != dataSettingsActivity.d && i10 != dataSettingsActivity.f29900x && i10 != dataSettingsActivity.M && i10 != 0 && i10 != dataSettingsActivity.P && i10 != dataSettingsActivity.I && i10 != dataSettingsActivity.S) {
                if (i10 != dataSettingsActivity.E && i10 != dataSettingsActivity.f29901y && i10 != dataSettingsActivity.F && i10 != dataSettingsActivity.G && i10 != dataSettingsActivity.J && i10 != dataSettingsActivity.K) {
                    if (i10 == dataSettingsActivity.H) {
                        return 4;
                    }
                    if (i10 != dataSettingsActivity.e && i10 != dataSettingsActivity.h && i10 != dataSettingsActivity.f29895f) {
                        i11 = dataSettingsActivity.saveToGalleryGroupsRow;
                        if (i10 != i11) {
                            i12 = dataSettingsActivity.saveToGalleryPeerRow;
                            if (i10 != i12) {
                                i13 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i10 != i13) {
                                    if (i10 != dataSettingsActivity.f29898s && i10 != dataSettingsActivity.v && i10 != dataSettingsActivity.f29896n) {
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
    public final void v(s4.c1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pu.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        Context context = this.f35902c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                c7Var = new org.telegram.ui.Cells.s8(context);
                            } else {
                                c7Var = new org.telegram.ui.Cells.j5(context);
                            }
                        } else {
                            c7Var = new org.telegram.ui.Cells.f9(context);
                        }
                    } else {
                        c7Var = new org.telegram.ui.Cells.x8(context);
                    }
                } else {
                    c7Var = new org.telegram.ui.Cells.m4(context, 22);
                }
            } else {
                c7Var = new org.telegram.ui.Cells.ga(context);
            }
        } else {
            c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        }
        return com.google.android.gms.internal.vision.e2.j(c7Var, c7Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        if (c1Var.f41613f == 3) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) c1Var.f41610a;
            int b10 = c1Var.b();
            DataSettingsActivity dataSettingsActivity = this.d;
            if (b10 == dataSettingsActivity.E) {
                x8Var.setChecked(SharedConfig.saveStreamMedia);
            } else if (b10 == dataSettingsActivity.f29901y) {
                x8Var.setChecked(SharedConfig.streamMedia);
            } else if (b10 == dataSettingsActivity.F) {
                x8Var.setChecked(SharedConfig.streamAllVideo);
            } else if (b10 == dataSettingsActivity.G) {
                x8Var.setChecked(SharedConfig.streamMkv);
            } else if (b10 == dataSettingsActivity.J) {
                x8Var.setChecked(SharedConfig.isAutoplayGifs());
            } else if (b10 == dataSettingsActivity.K) {
                x8Var.setChecked(SharedConfig.isAutoplayVideo());
            }
        }
    }
}
